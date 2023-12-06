function AddressController() {

    this.container = $(".js-event-form-container")

    const _this = this

    const addressPostalCodeInput = _this.container.find(".js-address-postal-code")
    const addressStreetInput = _this.container.find(".js-address-street")
    const addressNeighborhoodInput = _this.container.find(".js-address-neighborhood")
    const addressCityInput = _this.container.find(".js-address-city")
    const addressStateInput = _this.container.find(".js-address-state")

    this.init = function() {
        searchAddressOnCepBlur()
    }

    function cleanFormInputs(){
        addressStreetInput.val("")
        addressNeighborhoodInput.val("")
        addressCityInput.val("")
        addressStateInput.val("")
    }

    function setAddressInputs(street, neighborhood, city, state) {
        addressStreetInput.val(street)
        addressNeighborhoodInput.val(neighborhood)
        addressCityInput.val(city)
        addressStateInput.val(state)
    }

    function cleanFormAndAlert(message) {
        cleanFormInputs()
        alert(message)
    }

    function searchAddressOnCepBlur() {
        addressPostalCodeInput.on('blur', function() {
            const postalCode = addressPostalCodeInput.val().replace(/\D/g, '')

            if (postalCode !== "") {
                const validatePostalCode = /^[0-9]{8}$/

                if (validatePostalCode.test(postalCode)) {
                    setAddressInputs("...", "...", "...", "...")

                    $.getJSON(`https://viacep.com.br/ws/${postalCode}/json/?callback=?`, function(data) {
                        if (!("erro" in data)) {
                            setAddressInputs(data.logradouro, data.bairro, data.localidade, data.uf)
                        } else {
                            cleanFormAndAlert("CEP não encontrado.")
                        }
                    })
                } else {
                    cleanFormAndAlert("Formato de CEP inválido.")
                }
            } else {
                cleanFormInputs()
            }
        })
    }
}

let addressController
$(document).ready(function() {
    addressController = new AddressController()
    addressController.init()
})
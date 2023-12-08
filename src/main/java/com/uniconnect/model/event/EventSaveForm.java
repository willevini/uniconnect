package com.uniconnect.model.event;

import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public class EventSaveForm {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 200)
    private String image;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @NotBlank
    @Size(min = 8, max = 14)
    private String place;

    @NotBlank
    @Size(min = 8, max = 14)
    private String postalCode;

    @NotBlank
    @Size(min = 8, max = 14)
    private String street;

    @NotBlank
    @Size(min = 8, max = 14)
    private String neighborhood;

    @NotBlank
    @Size(min = 8, max = 14)
    private String city;

    @NotBlank
    @Size(min = 8, max = 14)
    private String state;

    @NotBlank
    @Size(min = 8, max = 14)
    private String addressNumber;

    @NotBlank
    @Size(min = 8, max = 14)
    private String description;

    @NotBlank
    @Size(min = 8, max = 14)
    private String enrollment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPlace() { return place; }

    public void setPlace(String place) {this.place = place; }

    public String getPostalCode() { return postalCode; }

    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getNeighborhood() { return neighborhood; }

    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getAddressNumber() { return addressNumber; }

    public void setAddressNumber(String addressNumber) { this.addressNumber = addressNumber; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getEnrollment() { return enrollment; }

    public void setEnrollment(String enrollment) { this.enrollment = enrollment; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }
}

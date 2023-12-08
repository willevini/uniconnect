package com.uniconnect.model.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginSaveForm {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

package com.uniconnect.model.user;

import com.uniconnect.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User extends BaseEntity {

    private String name;

    private String email;

    private String password;

}

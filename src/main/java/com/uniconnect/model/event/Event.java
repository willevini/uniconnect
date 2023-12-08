package com.uniconnect.model.event;

import com.uniconnect.model.enums.Status;
import com.uniconnect.model.enums.Category;

import com.uniconnect.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Event extends BaseEntity {

    private String name;

    private Date startDate;

    private Date endDate;

    private String place;

    private String postalCode;

    private String street;

    private String neighborhood;

    private String city;

    private String state;

    private String addressNumber;

    private String description;

    private String enrollment;

    private Status status;
    
    private Category category;
}
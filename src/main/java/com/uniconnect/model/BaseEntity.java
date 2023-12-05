package com.uniconnect.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;

import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateCreated;

    private Date dateUpdated;

    private Boolean deleted = false;

    public BaseEntity() {
        this.dateCreated = new Date();
        this.dateUpdated = new Date();
    }

    @PreUpdate
    private void setUpdatedDate() {
        this.dateUpdated = new Date();
    }
}
package com.uniconnect.model.event;

import com.uniconnect.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Event extends BaseEntity {

    private String name;

    private String place;

    private Date startDate;

    private Date endDate;
}

package com.uniconnect.model.event;

import com.uniconnect.model.enums.Status;
import com.uniconnect.model.enums.Category;

import com.uniconnect.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Event extends BaseEntity {

    private String name;

    private String image;

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

    public String obtainMonthNameInBrazilian() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM", new Locale("pt", "BR"));

        return formatter.format(this.endDate);
    }

    public Integer obtainYearFromDateUsingLocalDate() {
        LocalDate localDate = this.endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }
}
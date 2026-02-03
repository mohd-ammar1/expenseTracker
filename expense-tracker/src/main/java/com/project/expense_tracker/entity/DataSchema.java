package com.project.expense_tracker.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DataSchema {

    @Id
    private int id;
    private String name;
    private float amount;
    private LocalDate date;
    private String type;
    private String note;
    private String PaymentMethod;
    private String Category;

    public String toString() {
        return "DataSchema [name=" + name + ", amount=" + amount + ", date=" + date + ", type=" + type + ", note="
                + note + ", PaymentMethod=" + PaymentMethod + ", Category=" + Category + "]";
    }

}

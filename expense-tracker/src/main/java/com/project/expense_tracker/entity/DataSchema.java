package com.project.expense_tracker.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Transactions")
public class DataSchema {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

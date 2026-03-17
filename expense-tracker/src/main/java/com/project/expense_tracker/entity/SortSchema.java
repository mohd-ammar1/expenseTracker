package com.project.expense_tracker.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
public class SortSchema {
    String name;
    Double amount;
    String amountType;
    Date finaldate;
    String datetype;
    String typeslt;
    String method;

    public String toString(){
        return "Name: "+name+" Amount: "+amount+" AmountType: "+amountType+" Date: "+finaldate+" DateType: "+datetype+" Type: "+typeslt+" Method: "+method;
    }

}

package com.project.expense_tracker.service;

import com.project.expense_tracker.entity.DataSchema;
import com.project.expense_tracker.repositry.MariaRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Databaseservice {

    @Autowired
    public MariaRepositry mariaRepositry;

    public DataSchema saveData(DataSchema dataSchema){
        return mariaRepositry.save(dataSchema);
    }

    public List<DataSchema> allData(){
        return mariaRepositry.findAll();
    }

    public DataSchema updatebyId(int id,DataSchema dataSchema){

        DataSchema findRes = mariaRepositry.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
        findRes.setAmount(dataSchema.getAmount());
        findRes.setCategory(dataSchema.getCategory());
        findRes.setDate(dataSchema.getDate());
        findRes.setName(dataSchema.getName());
        findRes.setPaymentMethod(dataSchema.getPaymentMethod());
        findRes.setType(dataSchema.getType());
        findRes.setCategory(dataSchema.getCategory());
        findRes.setNote(dataSchema.getNote());
        return findRes;
    }

    public List<DataSchema> fetchFullData() {
        return mariaRepositry.findAll();
    }
}

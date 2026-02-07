package com.project.expense_tracker.service;

import com.project.expense_tracker.entity.UserSchema;
import com.project.expense_tracker.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepositry userRepositry;

    public void signup(UserSchema userSchema){
        userRepositry.save(userSchema);
    }

}

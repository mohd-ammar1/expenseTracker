package com.project.expense_tracker.repositry;

import com.project.expense_tracker.entity.UserSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<UserSchema,Long> {
}

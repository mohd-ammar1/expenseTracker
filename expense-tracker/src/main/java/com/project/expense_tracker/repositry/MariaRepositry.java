package com.project.expense_tracker.repositry;

import com.project.expense_tracker.entity.DataSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MariaRepositry extends JpaRepository<DataSchema,Integer> {
}

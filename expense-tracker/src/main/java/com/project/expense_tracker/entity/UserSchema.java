package com.project.expense_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Credentials")
public class UserSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Email", unique = true, nullable = false)
    private String email;
    @Column(name = "username")
    private String userName;
    @Column(name="Password")
    private String password;
}

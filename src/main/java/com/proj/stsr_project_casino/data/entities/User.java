package com.proj.stsr_project_casino.data.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private int balance;
}

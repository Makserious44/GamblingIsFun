package com.proj.stsr_project_casino.data.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue
    @Column(name = "sessionKey")
    private String sessionKey;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
}

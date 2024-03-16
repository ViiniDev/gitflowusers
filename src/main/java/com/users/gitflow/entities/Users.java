package com.users.gitflow.entities;

import com.users.gitflow.repositories.RequestUsers;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Long cpf;

    public Users(RequestUsers requestUsers){
        this.name = requestUsers.name();
        this.cpf = requestUsers.cpf();
    }
}

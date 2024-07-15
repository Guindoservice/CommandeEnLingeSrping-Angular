package com.example.cmd.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name="PERSONNEL")
@Entity
@NoArgsConstructor
@Data
public class Personnel extends Utilisateur {
    public Personnel(String username, String motDePasse) {
        super(username, motDePasse, RoleType.PERSONNEL);
    }
}
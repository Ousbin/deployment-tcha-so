package com.tchaso.tchaso.models;

import com.tchaso.tchaso.enumeration.Etat;
import com.tchaso.tchaso.enumeration.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin")
@NoArgsConstructor
public class Administrateur extends User  {


    /*@Column(name = "email")
    private String email;*/
    @Enumerated(EnumType.STRING)
    private Profile profile;

    public Administrateur(Integer id, String nom, String prenom, String numWhasapp, String genre, String email, Etat etat, String login, String password, Profile profile) {
        super(id, nom, prenom, numWhasapp, genre, email, etat, login, password);
        this.profile = profile;
    }
}

package tn.esprit.spring.evenement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPart;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Tache tache;
    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy="participants", cascade = CascadeType.ALL)
    private Set<Evenement> evenements;
    @JsonIgnore
    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Logistique> Logistiques;
}

package fr.epsi.stanislasbdx.PersistenceDonnees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class AdherentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_inscription", nullable = false)
    private Date dateDInscription;

    @ManyToMany
    @JoinTable(name = "emprunt",
            joinColumns = @JoinColumn(name = "adherent_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id"))
    private List<LivreEntity> livresEmpruntes;

    @OneToMany(mappedBy = "adherent")
    private List<EmpruntEntity> emprunts;

}

package fr.epsi.stanislasbdx.PersistenceDonnees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class EmpruntEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date_emprunt", nullable = false)
    private Date dateEmprunt;

    @Column(name = "date_fin_prevue", nullable = false)
    private Date dateFinPrevue;

    @Column(name = "date_retour", nullable = false)
    private Date dateRetour;

    @ManyToOne
    @JoinColumn(name = "adherent_id")
    private AdherentEntity adherent;

    @ManyToOne
    private LivreEntity livre;


}

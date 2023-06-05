package fr.epsi.stanislasbdx.PersistenceDonnees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class AuteurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "auteur_id", nullable = false)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @ManyToMany
    @JoinTable(name = "livre_auteur",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id"))
    private List<LivreEntity> livres;

    @ManyToMany
    @JoinTable(name = "auteur_categorie",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private List<CategorieEntity> categories;

}


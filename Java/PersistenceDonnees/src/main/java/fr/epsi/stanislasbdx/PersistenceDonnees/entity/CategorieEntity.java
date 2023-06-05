package fr.epsi.stanislasbdx.PersistenceDonnees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class CategorieEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "est_active", nullable = false)
    private boolean estActive;

    @OneToMany(mappedBy = "categorie")
    private List<LivreEntity> livres;

    @ManyToMany(mappedBy = "categories")
    private List<AuteurEntity> auteurs;

}


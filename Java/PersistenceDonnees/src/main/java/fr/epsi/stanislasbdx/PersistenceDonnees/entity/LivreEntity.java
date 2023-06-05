package fr.epsi.stanislasbdx.PersistenceDonnees.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class LivreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "livre_id", nullable = false)
    private Long id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "date_de_parution", nullable = false)
    private Date dateDeParution;

    @Column(name = "nombre_de_page", nullable = false)
    private Integer nombreDePage;

    @Column(name = "est_actif", nullable = false)
    private boolean estActif;

    @ManyToMany(mappedBy = "livres")
    private List<AuteurEntity> auteurs;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieEntity categorie;

    @OneToMany(mappedBy = "livre", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmpruntEntity> emprunts;


}

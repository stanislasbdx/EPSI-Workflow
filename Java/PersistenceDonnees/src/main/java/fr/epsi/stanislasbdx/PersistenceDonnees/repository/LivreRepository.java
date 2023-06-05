package fr.epsi.stanislasbdx.PersistenceDonnees.repository;

import fr.epsi.stanislasbdx.PersistenceDonnees.entity.LivreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivreRepository extends JpaRepository<LivreEntity, Long> {

    @Query("SELECT l FROM LivreEntity l JOIN l.auteurs a WHERE a.id = :auteurId")
    List<LivreEntity> findByAuteurId(@Param("auteurId") Long auteurId);

    @Query("UPDATE LivreEntity l SET l.estActif = false WHERE l.id = :livreId")
    void deleteLivreAndKeepEmprunts(@Param("livreId") Long livreId);
}
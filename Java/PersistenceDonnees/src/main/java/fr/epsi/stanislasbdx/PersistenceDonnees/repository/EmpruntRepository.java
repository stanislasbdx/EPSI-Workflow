package fr.epsi.stanislasbdx.PersistenceDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.EmpruntEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface EmpruntRepository extends JpaRepository<EmpruntEntity, Long> {

    @Query("SELECT COUNT(e) FROM EmpruntEntity e WHERE e.dateEmprunt >= :startDate AND e.dateEmprunt <= :endDate")
    Long countEmpruntsBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("SELECT COUNT(e) FROM EmpruntEntity e WHERE e.livre.id = :livreId")
    Long countEmpruntsByLivreId(@Param("livreId") Long livreId);

    @Query("SELECT e FROM EmpruntEntity e WHERE e.dateRetour IS NULL")
    List<EmpruntEntity> findEmpruntsEnCours();
}

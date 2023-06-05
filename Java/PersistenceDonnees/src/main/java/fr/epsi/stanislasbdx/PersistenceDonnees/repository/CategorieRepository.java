package fr.epsi.stanislasbdx.PersistenceDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.CategorieEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategorieRepository extends JpaRepository<CategorieEntity, Long> {

    @Query("UPDATE CategorieEntity c SET c.estActive = false WHERE c.id = :categorieId")
    void deleteCategorieAndKeepLivres(@Param("categorieId") Long categorieId);
}

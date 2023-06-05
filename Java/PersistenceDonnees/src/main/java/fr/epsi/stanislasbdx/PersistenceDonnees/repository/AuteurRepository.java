package fr.epsi.stanislasbdx.PersistenceDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AuteurEntity;

public interface AuteurRepository extends JpaRepository<AuteurEntity, Long> {

}

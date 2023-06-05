package fr.epsi.stanislasbdx.PersistenceDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AdherentEntity;

public interface AdherentRepository extends JpaRepository<AdherentEntity, Long> {
}

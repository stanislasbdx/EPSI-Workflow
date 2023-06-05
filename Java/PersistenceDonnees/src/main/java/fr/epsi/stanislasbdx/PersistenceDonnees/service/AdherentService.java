package fr.epsi.stanislasbdx.PersistenceDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsi.stanislasbdx.PersistenceDonnees.repository.AdherentRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AdherentEntity;

import java.util.List;

@Service
public class AdherentService {

    private final AdherentRepository adherentRepository;

    @Autowired
    public AdherentService(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    public AdherentEntity createAdherent(AdherentEntity adherent) {
        return adherentRepository.save(adherent);
    }

    public AdherentEntity getAdherentById(Long id) {
        return adherentRepository.findById(id).orElse(null);
    }

    public AdherentEntity updateAdherent(Long id, AdherentEntity adherent) {
        adherent.setId(id);
        return adherentRepository.save(adherent);
    }

    public void deleteAdherent(Long id) {
        adherentRepository.deleteById(id);
    }

    public List<AdherentEntity> getAllAdherents() {
        return adherentRepository.findAll();
    }
}

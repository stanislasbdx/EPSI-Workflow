package fr.epsi.stanislasbdx.PersistenceDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsi.stanislasbdx.PersistenceDonnees.repository.AuteurRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AuteurEntity;

import java.util.List;

@Service
public class AuteurService {

    private final AuteurRepository auteurRepository;

    @Autowired
    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public AuteurEntity createAuteur(AuteurEntity auteur) {
        return auteurRepository.save(auteur);
    }

    public AuteurEntity getAuteurById(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    public AuteurEntity updateAuteur(Long id, AuteurEntity auteur) {
        auteur.setId(id);
        return auteurRepository.save(auteur);
    }

    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }

    public List<AuteurEntity> getAllAuteurs() {
        return auteurRepository.findAll();
    }
}

package fr.epsi.stanislasbdx.PersistenceDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsi.stanislasbdx.PersistenceDonnees.repository.EmpruntRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.EmpruntEntity;

import java.util.List;

@Service
public class EmpruntService {

    private final EmpruntRepository empruntRepository;

    @Autowired
    public EmpruntService(EmpruntRepository empruntRepository) {
        this.empruntRepository = empruntRepository;
    }

    public EmpruntEntity createEmprunt(EmpruntEntity emprunt) {
        return empruntRepository.save(emprunt);
    }

    public EmpruntEntity getEmpruntById(Long id) {
        return empruntRepository.findById(id).orElse(null);
    }

    public EmpruntEntity updateEmprunt(Long id, EmpruntEntity emprunt) {
        emprunt.setId(id);
        return empruntRepository.save(emprunt);
    }

    public void deleteEmprunt(Long id) {
        empruntRepository.deleteById(id);
    }

    public List<EmpruntEntity> getAllEmprunts() {
        return empruntRepository.findAll();
    }
}

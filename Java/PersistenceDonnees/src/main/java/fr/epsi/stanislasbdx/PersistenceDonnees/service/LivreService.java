package fr.epsi.stanislasbdx.PersistenceDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsi.stanislasbdx.PersistenceDonnees.repository.LivreRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.LivreEntity;

import java.util.List;

@Service
public class LivreService {

    private final LivreRepository livreRepository;

    @Autowired
    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public LivreEntity createLivre(LivreEntity livre) {
        return livreRepository.save(livre);
    }

    public LivreEntity getLivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    public LivreEntity updateLivre(Long id, LivreEntity livre) {
        livre.setId(id);
        return livreRepository.save(livre);
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }

    public List<LivreEntity> getAllLivres() {
        return livreRepository.findAll();
    }
}

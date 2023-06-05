package fr.epsi.stanislasbdx.PersistenceDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsi.stanislasbdx.PersistenceDonnees.repository.CategorieRepository;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.CategorieEntity;

import java.util.List;

@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;

    @Autowired
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public CategorieEntity createCategorie(CategorieEntity categorie) {
        return categorieRepository.save(categorie);
    }

    public CategorieEntity getCategorieById(Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

    public CategorieEntity updateCategorie(Long id, CategorieEntity categorie) {
        categorie.setId(id);
        return categorieRepository.save(categorie);
    }

    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

    public List<CategorieEntity> getAllCategories() {
        return categorieRepository.findAll();
    }
}

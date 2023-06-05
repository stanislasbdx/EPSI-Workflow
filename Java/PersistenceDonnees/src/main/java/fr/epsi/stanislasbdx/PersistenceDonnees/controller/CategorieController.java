package fr.epsi.stanislasbdx.PersistenceDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.epsi.stanislasbdx.PersistenceDonnees.service.CategorieService;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.CategorieEntity;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    private final CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @PostMapping
    public ResponseEntity<CategorieEntity> createCategorie(@RequestBody CategorieEntity categorie) {
        CategorieEntity createdCategorie = categorieService.createCategorie(categorie);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategorie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategorieEntity> getCategorieById(@PathVariable("id") Long id) {
        CategorieEntity categorie = categorieService.getCategorieById(id);
        return ResponseEntity.ok(categorie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategorieEntity> updateCategorie(@PathVariable("id") Long id, @RequestBody CategorieEntity categorie) {
        CategorieEntity updatedCategorie = categorieService.updateCategorie(id, categorie);
        return ResponseEntity.ok(updatedCategorie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategorie(@PathVariable("id") Long id) {
        categorieService.deleteCategorie(id);
        return ResponseEntity.noContent().build();
    }
}
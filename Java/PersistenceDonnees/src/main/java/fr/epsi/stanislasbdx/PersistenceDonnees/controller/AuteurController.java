package fr.epsi.stanislasbdx.PersistenceDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.epsi.stanislasbdx.PersistenceDonnees.service.AuteurService;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AuteurEntity;

@RestController
@RequestMapping("/auteurs")
public class AuteurController {

    private final AuteurService auteurService;

    @Autowired
    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @PostMapping
    public ResponseEntity<AuteurEntity> createAuteur(@RequestBody AuteurEntity auteur) {
        AuteurEntity createdAuteur = auteurService.createAuteur(auteur);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAuteur);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuteurEntity> getAuteurById(@PathVariable("id") Long id) {
        AuteurEntity auteur = auteurService.getAuteurById(id);
        return ResponseEntity.ok(auteur);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuteurEntity> updateAuteur(@PathVariable("id") Long id, @RequestBody AuteurEntity auteur) {
        AuteurEntity updatedAuteur = auteurService.updateAuteur(id, auteur);
        return ResponseEntity.ok(updatedAuteur);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuteur(@PathVariable("id") Long id) {
        auteurService.deleteAuteur(id);
        return ResponseEntity.noContent().build();
    }
}
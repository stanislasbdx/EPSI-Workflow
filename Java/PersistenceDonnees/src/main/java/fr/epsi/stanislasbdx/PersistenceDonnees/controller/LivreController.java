package fr.epsi.stanislasbdx.PersistenceDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.epsi.stanislasbdx.PersistenceDonnees.service.LivreService;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.LivreEntity;

@RestController
@RequestMapping("/livres")
public class LivreController {

    private final LivreService livreService;

    @Autowired
    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @PostMapping
    public ResponseEntity<LivreEntity> createLivre(@RequestBody LivreEntity livre) {
        LivreEntity createdLivre = livreService.createLivre(livre);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLivre);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivreEntity> getLivreById(@PathVariable("id") Long id) {
        LivreEntity livre = livreService.getLivreById(id);
        return ResponseEntity.ok(livre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivreEntity> updateLivre(@PathVariable("id") Long id, @RequestBody LivreEntity livre) {
        LivreEntity updatedLivre = livreService.updateLivre(id, livre);
        return ResponseEntity.ok(updatedLivre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivre(@PathVariable("id") Long id) {
        livreService.deleteLivre(id);
        return ResponseEntity.noContent().build();
    }
}

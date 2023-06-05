package fr.epsi.stanislasbdx.PersistenceDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.epsi.stanislasbdx.PersistenceDonnees.service.EmpruntService;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.EmpruntEntity;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {

    private final EmpruntService empruntService;

    @Autowired
    public EmpruntController(EmpruntService empruntService) {
        this.empruntService = empruntService;
    }

    @PostMapping
    public ResponseEntity<EmpruntEntity> createEmprunt(@RequestBody EmpruntEntity emprunt) {
        EmpruntEntity createdEmprunt = empruntService.createEmprunt(emprunt);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmprunt);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpruntEntity> getEmpruntById(@PathVariable("id") Long id) {
        EmpruntEntity emprunt = empruntService.getEmpruntById(id);
        return ResponseEntity.ok(emprunt);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpruntEntity> updateEmprunt(@PathVariable("id") Long id, @RequestBody EmpruntEntity emprunt) {
        EmpruntEntity updatedEmprunt = empruntService.updateEmprunt(id, emprunt);
        return ResponseEntity.ok(updatedEmprunt);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmprunt(@PathVariable("id") Long id) {
        empruntService.deleteEmprunt(id);
        return ResponseEntity.noContent().build();
    }
}
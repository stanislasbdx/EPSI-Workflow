package fr.epsi.stanislasbdx.PersistenceDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.epsi.stanislasbdx.PersistenceDonnees.service.AdherentService;
import fr.epsi.stanislasbdx.PersistenceDonnees.entity.AdherentEntity;

@RestController
@RequestMapping("/adherents")
public class AdherentController {

    private final AdherentService adherentService;

    @Autowired
    public AdherentController(AdherentService adherentService) {
        this.adherentService = adherentService;
    }

    @PostMapping
    public ResponseEntity<AdherentEntity> createAdherent(@RequestBody AdherentEntity adherent) {
        AdherentEntity createdAdherent = adherentService.createAdherent(adherent);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdherent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdherentEntity> getAdherentById(@PathVariable("id") Long id) {
        AdherentEntity adherent = adherentService.getAdherentById(id);
        return ResponseEntity.ok(adherent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdherentEntity> updateAdherent(@PathVariable("id") Long id, @RequestBody AdherentEntity adherent) {
        AdherentEntity updatedAdherent = adherentService.updateAdherent(id, adherent);
        return ResponseEntity.ok(updatedAdherent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdherent(@PathVariable("id") Long id) {
        adherentService.deleteAdherent(id);
        return ResponseEntity.noContent().build();
    }
}
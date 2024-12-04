package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")  // Pour permettre les requêtes CORS depuis Angular
@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/inscription")
    public ResponseEntity<String> inscrireUtilisateur(@Valid @RequestBody Utilisateur utilisateur) {
        utilisateurService.inscrireUtilisateur(utilisateur);
        return ResponseEntity.ok("Inscription réussie !");
    }
}

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    boolean existsByEmail(String email);  // Méthode pour vérifier si l'email existe déjà
}

package org.example.Exercice4;

import exception.NotFoundException;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class RechercheVille {
    private List<String> villes;

    public RechercheVille() {
        villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
    }

    public List<String> rechercher(String mot) {
        if (mot.length() < 2 && mot != "*") {
            throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères.");
        }
        if (mot.equals("*")) {
            return new ArrayList<>(villes);
        }
        String lowerCaseMot = mot.toLowerCase();
        return villes.stream()
                .filter(ville -> ville.toLowerCase().contains(lowerCaseMot))
                .collect(Collectors.toList());
    }

    public List<String> getVilles() {
        return villes;
    }
}
package org.example.Exercice4;

import static org.junit.jupiter.api.Assertions.*;

import exception.NotFoundException;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RechercheVilleTest {

    @Test
    public void testRechercheMoinsDeDeuxCaracteres() {
        RechercheVille rechercheVille = new RechercheVille();
        assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("a"));
    }

    @Test
    public void testRechercheCommencePar() throws ExecutionControl.NotImplementedException {
        RechercheVille rechercheVille = new RechercheVille();
        List<String> result = rechercheVille.rechercher("Va");
        assertIterableEquals(List.of("Valence", "Vancouver"), result);
    }
}
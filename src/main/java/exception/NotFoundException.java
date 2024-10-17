package exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("Le texte de la recherche contient moins de 2 caractères");
    }
}
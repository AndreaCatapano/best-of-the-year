package org.lessons.java.best_of_the_year.classes;

public final class Utility {

    public static String toSlug(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        return input.toLowerCase() // minuscolo
                .trim() // rimuovi spazi iniziali/finali
                .replaceAll("[àáâãäå]", "a") // sostituisci caratteri accentati
                .replaceAll("[èéêë]", "e")
                .replaceAll("[ìíîï]", "i")
                .replaceAll("[òóôõö]", "o")
                .replaceAll("[ùúûü]", "u")
                .replaceAll("[ç]", "c")
                .replaceAll("[ñ]", "n")
                .replaceAll("[^a-z0-9\\s-]", "") // rimuovi caratteri speciali
                .replaceAll("\\s+", "-") // spazi → trattini
                .replaceAll("-+", "-") // trattini multipli → singolo
                .replaceAll("^-+|-+$", ""); // rimuovi trattini inizio/fine
    }
}

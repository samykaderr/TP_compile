import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Analyseur lexical pour les identificateurs L14 (méthode style exo2)");
        System.out.println("Règles :");
        System.out.println("- Commencer par une lettre");
        System.out.println("- Contenir des lettres, chiffres et underscores");
        System.out.println("- Se terminer par une lettre ou un chiffre");
        System.out.println();

        while (true) {
            System.out.print("Donner l'identificateur a verifier : ");
            String mot = sc.nextLine();

            if (mot.equalsIgnoreCase("quit")) {
                System.out.println("Au revoir !");
                break;
            }

            // Ajout d'un sentinelle comme dans exo2
            mot = mot + '#';
            System.out.println(mot);

            boolean valide = false;
            int i = 0;

            // Vérifier premier caractère : doit être une lettre
            if (mot.charAt(i) == 'a' || mot.charAt(i) == 'b') {
                i++;
                boolean invalide = false;

                // Lire caractère par caractère jusqu'au sentinelle
                while (true) {
                    char c = mot.charAt(i);
                    if (c == '#') {
                        break;
                    }
                    if (Character.isLetterOrDigit(c) || c == '_') {
                        i++;
                    } else {
                        invalide = true; // caractère illégal
                        break;
                    }
                }

                if (!invalide) {
                    // L'identificateur est valide seulement si le caractère avant '#' est lettre ou chiffre
                    char avant = mot.charAt(i - 1);
                    if (Character.isLetterOrDigit(avant)) {
                        valide = true;
                    } else {
                        valide = false;
                    }
                } else {
                    valide = false;
                }
            } else {
                valide = false;
            }

            // Affichage du résultat
            if (valide) {
                System.out.println("le mot <" + mot + "> appartient au language");
            } else {
                System.out.println("le mot <" + mot + "> n'appartient pas au language");
            }
            System.out.println();
        }

        sc.close();
    }
}
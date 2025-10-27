
import java.util.Scanner;

public class exo2_L1 {
    public static void main(String[] args) {
        //l'expression regulaire est : bb  + ( b + aa* b)
        //le mot minimale 'bb'
        String word;
        boolean valide = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        word = sc.nextLine();
        sc.close();
        word = word.toLowerCase();
        // Option B: accepter 'b' OU 'bb' OU a+ b (au moins un 'a' puis 'b')
        if (word == null || word.length() == 0) {
            System.out.println("Mot vide : non valide.");
            return;
        }

        // Le mot doit commencer par au moins 'bb' et respecter la forme bb+(b | aa*b)
        if (word.length() < 3) { // minimum: bb + suffix d'au moins 1 caractère
            System.out.println("Mot non valide : doit commencer par 'bb' et respecter bb+(b | aa*b).");
            return;
        }

        // essayer toutes les coupures où le préfixe contient au moins 2 'b'
        int n = word.length();
        boolean matched = false;
        for (int k = 2; k <= n - 1; k++) { // k = longueur du préfixe b b+
            boolean prefixAllB = true;
            for (int i = 0; i < k; i++) {
                if (word.charAt(i) != 'b') {
                    prefixAllB = false;
                    break;
                }
            }
            if (!prefixAllB) break; // si les deux premiers ne sont pas 'b', plus rien à tester

            String suffix = word.substring(k); // partie après le préfixe bb+

            // cas suffix == "b"
            if (suffix.equals("b")) {
                matched = true;
                break;
            }

            // cas suffix de la forme a+ b (au moins un 'a' suivi d'un 'b')
            if (suffix.length() >= 2 && suffix.charAt(suffix.length() - 1) == 'b') {
                boolean allA = true;
                for (int i = 0; i < suffix.length() - 1; i++) {
                    if (suffix.charAt(i) != 'a') {
                        allA = false;
                        break;
                    }
                }
                if (allA) {
                    matched = true;
                    break;
                }
            }
            // sinon essayer un préfixe 'bb+' plus long (boucle continue)
        }

        if (matched) {
            System.out.println("Mot valide selon bb+(b | aa*b).");
        } else {
            System.out.println("Mot non valide selon bb+(b | aa*b). Le mot doit commencer par 'bb' et se poursuivre par 'b' ou 'a...ab'.");
        }
        return;
       
    }
}

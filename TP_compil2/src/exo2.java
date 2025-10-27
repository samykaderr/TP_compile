import java.util.Scanner;

public class exo2 {

    public static void main(String[] args) {
        while (true) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le mot a verifier:  ");
        String mot = sc.nextLine() + '#'; // ou mot += "#";
        System.out.println(mot); // affiche le mot pour rassurer que il ajoute le #
        mot.toLowerCase();
        boolean valide = false;
        int i = 0;
        if (mot.charAt(i) == 'b') {
            i++;
            if (mot.charAt(i) == 'b') {
                i++;
                while (mot.charAt(i) == 'b' || mot.charAt(i) == 'a') {
                    i++;
                }
                if (mot.charAt(i) == '#') {
                    //verifier si le caractere avant le # cest pas un a
                    if (mot.charAt(i - 1) == 'b') {
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
        } else {
            valide = false;
        }
        //affichage du resultat
        if (valide == false ) {
            System.out.println("le mot " + mot + "n'appartient pas au language ");
        } else {
            System.out.println("le mot " + mot + "appartient au language ");
        }

        }
    }
}

import java.util.Scanner;

public class exo2_L2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Donner le mot a verifier : ");
            Scanner sc = new Scanner(System.in);
            String mot = sc.nextLine()+'#';
            System.out.println(mot);
            int i=0;
            int nbra = 0;
            int valide ;
            if(mot.charAt(i)=='a'){
                nbra++;
                i++;
                while(mot.charAt(i)=='b' || mot.charAt(i)=='a'){
                    if(mot.charAt(i)=='a'){
                        nbra++;
                    }
                    i++;
                }
                if(mot.charAt(i)=='#'){
                    if(mot.charAt(i-1) == 'b' && nbra %2 != 0){
                        valide = 1;
                    }else{
                        valide = -1;
                    }
                }else {
                    valide = -1;
                }
            }else{
                valide = -1;
            }

            //afiche resultat
            if(valide == 1){
                System.out.println("le mot donner <"+mot+"> est valider");
            }else if(valide == -1){
                System.out.println("le mot donner <"+mot+"> n'est pas valider");
            }
        }
    }
}

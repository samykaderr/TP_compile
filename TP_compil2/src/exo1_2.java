import java.util.Scanner;

public class exo1_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        sc.close();
                System.out.println("The word is: " + word);
        // verification 'd' mot
 boolean valid = true;
        String result ="";
        if(word.charAt(0) == 'd'){
            result += word.charAt(0);

        }else{ valid = false; }
        System.out.println(result);
        // verifier   a.a*
        String mot ="";
        int i =1;
       if (word.charAt(i) == 'a'){
            while(word.charAt( i ) == 'a'){
                 result = result + word.charAt(i);
                 i++;
                 
            }
       }else{valid = false;}
        System.out.printf("le nombre de a  est %d .%n" ,i-1);
        mot = mot+ word.substring(i);
        System.out.println( "la suite a tester "+mot );
        System.out.println("la partie verifier "+result);
        
        // verifier  (b*)
        int j = 0;
       
        while (j < mot.length()) {
            if (mot.charAt(j) == 'b') {
                result = result + mot.charAt(j);
            } else {
                valid = false;
                break;
            }
            j++;
        }

        if (!valid) {
            System.out.println("Mot non valide : la suite doit être de la forme b* (0 ou plusieurs 'b').");
        } else {
            System.out.println("Mot valide selon d aa* b*.");
        }

        

    }
}

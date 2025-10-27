import java.util.Scanner;

public class exo1 {
public static void main(String[] args) {
    while(true){
        Scanner mot  = new Scanner(System.in);
        System.out.println("Enter the world : il faut qu'il se termine par '#'");
         String word = mot.nextLine()+'#';
         word = word.toLowerCase();

      boolean valide = true;
        int i =0;
         if(word.charAt(i) == 'c'){
             i++;
             if (word.charAt(i) == 'c'){
                 i++;
                 if (word.charAt(i) == 'a'){
                     i++;
                     if (word.charAt(i) == '#'){
                         valide = true;
                     }
                 }else{
                     valide = false;
                 }

             }
             else if (word.charAt(i) == 'a'){
                 i++;
                 if (word.charAt(i) == 'b'){
                     i++;
                     if (word.charAt(i) == '#'){
                         valide = true;
                     }else{
                         valide = false; }
                 }
                 else{
                     valide = false;}
             } else{
                 valide = false;}



         } else {valide = false;}

             if (!valide){
                 System.out.println("le mot n'est pas valide");
             }else {
                 System.out.println("le mot est  invalide");
             }
    }
    }
}

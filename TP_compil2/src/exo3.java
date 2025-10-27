import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the word to verifie : ");
            String mot = in.nextLine()+'#';
            mot.toLowerCase();
            System.out.print(mot);
            //verifier le mot
            int i =0 ;
            int valide =0 ;
            if(mot.charAt(i)>= 'a' && mot.charAt(i)<= 'z' || mot.charAt(i)>= 'A' && mot.charAt(i)<= 'Z' || mot.charAt(i)!='_' || mot.charAt(i)!='0' && mot.charAt(i)!='9'){
                i++;

                while(mot.charAt(i)>='a' && mot.charAt(i)<='z' || mot.charAt(i)=='_' || mot.charAt(i)>='A' && mot.charAt(i)<='Z' || mot.charAt(i )>='0' && mot.charAt(i )<='9'){
                    i++;

                }
                if(mot.charAt(i)=='#'){

                    if(mot.charAt(i - 1)>='a' && mot.charAt(i - 1)<='z' || mot.charAt(i - 1)>='A' && mot.charAt(i - 1)<='Z' || mot.charAt(i - 1)>='0' && mot.charAt(i - 1)<='9'){

                        valide =1;
                    }
                }else{
                    valide = -1;
                }
            }else{
                valide = -1;
            }
            //affichage result

            if(valide == 1){
                System.out.println("The word "+mot +" is verified");
            }else if(valide == -1){
                System.out.println("The word "+mot +" is not verified");
            }
        }
    }
}


import java.util.Scanner;
import java.util.WeakHashMap;

public class exo1_2v2 {
    public static void main(String[] args) {

    while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word that ens with '#'");
        String word = sc.nextLine() + '#';
        sc.close();
        boolean valide= true;
        int i =0;
            if(word.charAt(0)=='d'){
                i++;
                if(word.charAt(i) == 'a'){
                    i++;
                    while(word.charAt(i) == 'a'){
                        i++;
                    }

                }else{
                    valide = false;
                }




                    while(word.charAt(i) == 'b'){
                        i++;
                    }
                    if(word.charAt(i)=='#'){
                        valide = true;
                    }else {
                        valide = false;
                    }
            }else
                if(word.charAt(i)=='#'){
                    valide = true;
                }


            if(valide){
                System.out.println("le mot est acceptable");
            }else{
                System.out.println("erreur lexicale");
            }
    }
    }
}

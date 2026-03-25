package Partier4;
import java.util.Scanner;

public class TP1ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaine: ");
        String ch = sc.nextLine();
        String inv = "";
        for (int i=ch.length()-1;i>=0;i--){
            inv+=ch.charAt(i);
        }
        if(ch.equals(inv)){
            System.out.println(ch+" est un palindrome.");
        }
        else {
            System.out.println(ch+" n'est pas un palindrome.");
        }
        sc.close();
    }
}
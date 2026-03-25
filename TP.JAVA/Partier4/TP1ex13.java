package Partier4;
import java.util.Scanner;

public class TP1ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaine: ");
        String ch = sc.nextLine();
        String inv = "";
        for (int i=ch.length()-1;i>=0;i--){
            inv+=ch.charAt(i);
        }
        System.out.print("string inversé est : "+inv);
        sc.close();
    }
}
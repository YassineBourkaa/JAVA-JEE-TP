package Partier4;
import java.util.Scanner;
public class TP1ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaine: ");
        String ch = sc.nextLine();
        System.out.println("Longueur = " + ch.length());
        sc.close();
    }
}
package Partier2;

import java.util.Scanner;
public class TP1ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher position d'un nombre dans un tablausx remplir par l'utilisateur");
        int[] tab = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("entre l'element "+(i+1));
            tab[i]=sc.nextInt();
        }
        System.out.println("entrer le nombre a chercher");
        int N=sc.nextInt();
        boolean G = false;
        for(int i=0;i<10;i++){
            if(tab[i]==N){
                G=true;
                System.out.println("le position de votre nombre est " +(i+1));
                break;
            }
        }
        if(G==false){
            System.out.println("le nombre n'a pas trouver ");
            sc.close();
            
        }

    }
}
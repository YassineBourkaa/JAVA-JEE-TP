package Partier2;

import java.util.Scanner;
public class TP1ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher tablausx remplir par l'utilisateur");
        System.out.println("vielle entrer la taille de tablaux  ");
        int N = sc.nextInt();
        int[] tab=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("entrer l'element "+ (i+1) +":");
            tab[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.println(tab[i]);
        }
        sc.close();
    }
}
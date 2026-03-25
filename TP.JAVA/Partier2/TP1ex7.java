package Partier2;

import java.util.Scanner;
public class TP1ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher le plus grand element d'un tablausx remplir par l'utilisateur");
        System.out.println("vielle entrer la taille de tablaux  ");
        int N = sc.nextInt();
        int[] tab=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("entrer l'element "+ (i+1) +":");
            tab[i]=sc.nextInt();
        }
        int max = tab[0];
        for(int i=1;i<N;i++){
            if(tab[i]>max){
                max=tab[i];
            }
        }
        System.out.println("le plus grand element est "+max);
        sc.close();
    }
}
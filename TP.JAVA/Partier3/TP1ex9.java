package Partier3;

import java.util.Scanner;
public class TP1ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher la soome d'un matrice remplir par l'utilisateur");
        int[][] mat = new int[3][3];
        int som=0;
        System.out.println("remplir le matris de volume[3][3]");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("entrer l'element"+(i+1)+","+(j+1));
                mat[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                som+=mat[i][j];
            }
        }
        System.out.println("alors la somme est "+som);
        sc.close();
    }
}
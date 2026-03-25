import java.util.Scanner;
public class TP1ex4 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui calculer la somme des prmier N ");
        System.out.println("vielle entrer le nombre N ");
        int N=sc.nextInt();
        int i=1;
        int s=0;
        while (i<=N) {
            s+=i;
            i++;
        }
        System.err.println("la somme est "+s);
        sc.close();
    }
}
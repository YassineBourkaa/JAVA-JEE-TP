import java.util.Scanner;
public class TP1ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher le plus grand nombre ");
        System.out.println("vielle entrer les 3 variable");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int G=a;
        if(a<b){
            G=b;
        }
        if (G<c){
            G=c;
        }
        System.out.println(G+" est le plus grand nomber");
        sc.close();
    }   
}

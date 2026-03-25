import java.util.Scanner;
public class TP1ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programme qui deticter le signe d'un nombre");
        System.out.println("vielle entrer le nombre");
        int n = sc.nextInt();
        if (n<0){
            System.out.println(n+ " est négative ");
        }
        else if (n>0){
            System.out.println(n+" est pisitife ");
        }
        else {
            System.out.println(n+" est null");
        }
        sc.close();
    }
}
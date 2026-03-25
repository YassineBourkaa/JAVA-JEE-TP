import java.util.Scanner;
public class TP1ex3 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("le programme qui aficher tablausx de multiplication");
        System.out.println("vielle entrer un nombre ");
        int n=sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        sc.close();
    }
}

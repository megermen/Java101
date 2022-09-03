import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {
       
        double a , b , c , u , alan;

        
        Scanner until = new Scanner(System.in);

        System.out.println("a uzunluğunu giriniz : ");
        a = until.nextDouble();

        System.out.println("b uzunluğunu giriniz : ");
        b = until.nextDouble();

        System.out.println("c uzunluğunu giriniz : ");
        c = until.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
          
        System.out.println("u değeri :" + u);
        System.out.println("alan degeri :" + alan);
    }
}

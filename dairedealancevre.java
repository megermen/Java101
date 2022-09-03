import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {

       /* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        */

        double r, pi = 3.14, alan, cevre;

        Scanner until = new Scanner(System.in);
        System.out.print("yarıcapı giriniz :");
        r = until.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("dairenin alanı: " + alan);
        System.out.println("dairenin cevresi: " + cevre);
    }
}





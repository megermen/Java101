import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {

       /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

          𝜋 sayısını = 3.14 alınız.

          Formül : (𝜋 * (r*r) * 𝛼) / 360

       */

        double r, pi = 3.14, acı, alan;

        Scanner until = new Scanner(System.in);

        System.out.print("yarıcapı giriniz :");
        r = until.nextDouble();

        System.out.print("a acısını giriniz :");
        acı = until.nextDouble();

        alan = (pi * (r*r) * acı) / 360;

        System.out.println("daire diliminin alanı: " + alan);

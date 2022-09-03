import java.util.Locale;
import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {

         double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00 , toplam;
         double armutKg , elmaKg , domatesKg , muzKg, patlicanKg;


        Scanner until = new Scanner(System.in);

        System.out.print("armut kaç kilo? :");
        armutKg= until.nextDouble();

        System.out.print("elma kaç kilo? :");
        elmaKg = until.nextDouble();

        System.out.print("domates kaç kilo? :");
        domatesKg = until.nextDouble();

        System.out.print("muz kaç kilo? :");
        muzKg = until.nextDouble();

        System.out.print("patlican kaç kilo? :");
        patlicanKg = until.nextDouble();

        toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("toplam tutar: "+ toplam + "tl");



    }
}




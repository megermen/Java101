import java.util.Scanner;

public class çinzodyagı {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int doğumyılı, kalan;

        System.out.println("doğum yılınızı giriniz:");

        doğumyılı = input.nextInt();

        kalan = (doğumyılı % 12);

        if (kalan == 0) {
            System.out.println("Çin Zodyağı: Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı: Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı: Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı: Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı: Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zodyağı: Öküz");
        }
        if (kalan == 6) {
            System.out.println("Çin Zodyağı: Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı: Tavşan");
        }
        if (kalan == 8) {
            System.out.println("Çin Zodyağı: Ejdarha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı: Yılan");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı: At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyağı: Koyun");
        }

    }
}



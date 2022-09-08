
import java.util.Scanner;

public class burcprogramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık
        //
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart

        System.out.print("kaçıncı ayda doğdunuz :");
        month = input.nextInt();

        System.out.print("doğdunuz günü giriniz :");
        day = input.nextInt();

        if (month == 1) {
            if (day <= 21) {
                System.out.println("oğlak burcusun");
            } else {
                System.out.println("kova burcusun");
            }
        }
    
        if (month == 2) {
            if (day <= 19) {
                System.out.println("kova burcusun");

            } else {
                System.out.println("balık burcusun");
            }
        }
        if (month == 3) {
            if (day <= 20) {
                System.out.println("balık burcusun");
            } else System.out.println("koç burcusun");

        }
        if (month == 4) {
            if (day <= 20) {
                System.out.println("koç burcusun");
            } else System.out.println("boğa burcusun");

        } if (month == 5) {
            if (day <= 21)
                System.out.println("boğa burcusun");
        } else System.out.println("ikizler burcusun");

        if (month == 6) {
            if (day <= 22) {
                System.out.println("ikizler burcusun");
            } else System.out.println("yengeç burcusun");

        }        if (month == 7) {
            if (day <= 22) {
                System.out.println("yengeç burcusun");
            } else System.out.println("aslan burcusun");
        }
        if (month == 8) {
            if (day <= 22) {
                System.out.println("aslan burcusun");
            } else System.out.println("başak burcusun");
        }
        if (month == 9) {
            if (day <= 22) {
                System.out.println("başak burcusun");
            } else System.out.println("terazi burcusun");
        }
        if (month == 10) {
            if (day <= 22) {
                System.out.println("terazi burcusun");
            } else System.out.println("akrep burcusun");
        }
        if (month == 11) {
            if (day <= 21) {
                System.out.println("akrep burcusun");
            } else System.out.println("yay burcusun");
        }
        if (month == 12) {
            if (day <= 21) {
                System.out.println("yay burcusun");
            } else System.out.println("oğlak burcusun");
        }

    }
}

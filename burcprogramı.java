import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
    
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
            if (day <= 21){
                System.out.println("boğa burcusun");

            }else System.out.println("ikizler burcusun");
        }

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


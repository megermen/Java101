import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("ilk sayıyı giriniz :");
        n1 = value.nextInt();

        System.out.print("ikinci sayıyı giriniz :");
        n2 = value.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("Seçiminiz :");
        select = value.nextInt();

        switch (select)    {
            case 1:
                System.out.println("Toplam = "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma = "+ (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma = "+ (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı sıfıra bolunemez !");
                        break;

                    default:
                        System.out.println("Bolme = "+ (n1 / n2));
                }
                break;

            default:
                System.out.println("Yanlıs sayı girdiniz. Tekrar deneyiniz.");

        }
    }
}





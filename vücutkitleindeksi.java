import java.util.Locale;
import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {

      double boy , kilo , vücutkitleindeksi;

      Scanner until = new Scanner(System.in);

      System.out.print("boyunuzu metre cinsinden giriniz :");
      boy = until.nextDouble();

      System.out.print("kilonuzu giriniz : ");
      kilo = until.nextDouble();

      vücutkitleindeksi = (kilo / (boy * boy)) ;
      System.out.print("vücut kitle endeksiniz :" + vücutkitleindeksi);
      

    }
}




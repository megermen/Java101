import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
    
        double tutar , kdvoran = 0.18, kdvtutar , kdvlifiyat;

        Scanner until = new Scanner(System.in);
        System.out.println("bir tutar giriniz :");
        tutar = until.nextDouble();
        
        if (tutar <= 1000){
            kdvoran = 0.18;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
            
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+kdvlifiyat);
        }
        else {
            kdvoran = 0.08;
            kdvtutar = tutar * kdvoran;
            kdvlifiyat = tutar + kdvtutar;
            
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+kdvlifiyat);

        }
    }
}

import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        
        int km;
        double perKm =2.20 , total , startPrice =10;

        
        Scanner until = new Scanner(System.in);

        System.out.println("mesafeyi giriniz: ");
        km = until.nextInt();

        

        total = (km*perKm);
        total += startPrice;

        total = (total<20) ? 20 : total;

         
        System.out.println("toplam ödenecek tutar :" + total);

import java.util.Scanner;
public class giriş {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password, newPassword, answer;
        System.out.print("kullanıcı adınızı giriniz :");
        userName = input.nextLine();

        System.out.print("şifrenizi giriniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("dev")) {
            System.out.println("giriş yapıldı");
        } else {
            System.out.println("bilgileriniz hatalı");

            System.out.println("şifrenizi sıfırlamak ister misiniz?");
        }
        answer = input.nextLine();
        if (answer.equals("evet"))

            System.out.println("yeni şifrenizi giriniz:");
        newPassword = input.nextLine();

        if (newPassword.equals("dev"))
            System.out.println("eski şifreniz ile yeni şifreniz aynı olamaz");

        else {
            System.out.println("şifreniz başarıyla değiştirildi");
        }

    }

}

package Week1;
import java.util.Scanner;
public class Practice13_UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validUserName = "java", validPassword = "123456", userName, password;
        int answer;

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals(validUserName) && password.equals(validPassword)) {
            System.out.println("Giriş Başarılı.");
        } else {
            System.out.print("Hatalı Şifre! Şifrenizi Sıfırlamak İster Misiniz? 1- Evet 2- Hayır: ");
            answer = input.nextInt();
            input.nextLine(); //Bu ekstra input.nextLine() çağrısı, kullanıcının girdiği boş satırı okuyacaktır. Çünkü kullanıcı "Evet" veya "Hayır" gibi bir metin girecektir, bu da bir satır boşluk bırakacak ve bu boş satırı almak için input.nextLine() çağrısına ihtiyacınız olacak.
            if (answer == 1) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(validPassword)) {
                    System.out.println("Yeni Şifreniz Eski Şifre ile Aynı Olamaz! Şifre Oluşturulamadı!");
                } else {
                    validPassword = newPassword;
                    System.out.println("Yeni Şifre Oluşturuldu!");
                }
            } else if (answer == 2) {
                System.out.println("Çıkış Yapıldı!");
            } else {
                System.out.println("Hatalı Giriş Yaptınız!");
            }
        }
    }
}

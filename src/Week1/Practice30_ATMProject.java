package Week1;

import java.util.Scanner;

public class Practice30_ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, amount;
        int operation;

        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Parola: ");
            password = input.nextLine();

            if (userName.equals("yasarcan") && password.equals("damlı")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorma\n4-Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    operation = input.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.println("Yatırmak İstediğiniz Para Miktarı: ");
                            amount = input.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Para Miktarı: ");
                            amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("Yetersiz Bakiye!");
                            } else {
                                balance -= amount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (operation != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka ile İletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}

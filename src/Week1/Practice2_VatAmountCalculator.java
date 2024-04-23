package Week1;

import java.util.Scanner;

public class Practice2_VatAmountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Kredi hesabı için değişkenlerin tanımlanması (Definition of the variables for calculation of the VAT)
        (amount = KDV'siz tutar, vatRate = KDV oranı, vatAmount = KDV tutarı, amountWithVat = KDV'li tutar)*/
        double amount, vatRate, vatAmount, amountWithVat;

        System.out.println("Lütfen KDV'sini hesaplamak istediğiniz tutarı giriniz: ");
        amount = input.nextDouble();

        /*KDV oranının KDV'siz tutara göre belirlenmesi (Determining the VAT rate according to the VAT free amount)*/
        if (amount > 0 && amount <= 1000) {
            vatRate = 0.18;
        } else if (amount > 1000) {
            vatRate = 0.08;
        } else { /*KDV'siz tutarın 0 veya altında girilmesi halinde hesaplamanın durdurulup ekrana uyarı mesajı
        gösterilmesi (If the VAT free amount is entered as 0 or below, stopping the calculation and displaying a warning
        message on the screen)*/
            System.out.println("Lütfen 0'dan büyük bir tutar giriniz!");
            return;
        }

        /*KDV tutarının ve KDV'li tutarın hesaplanması (Calculation of the VAT amount and the amount with VAT)*/
        vatAmount = amount * vatRate;
        amountWithVat = amount + vatAmount;

        /*Program çıktısının kullanıcıya göserilmesi (Displaying the program output to the user)*/
        System.out.println("Girilen tutar: " + amount);
        System.out.println("KDV'li tutar: " + amountWithVat);
        System.out.println("KDV tutarı: " + vatAmount);
    }
}

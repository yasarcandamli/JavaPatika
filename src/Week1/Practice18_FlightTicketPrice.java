package Week1;
import java.util.Scanner;
public class Practice18_FlightTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, passengerAge, flightType;
        double unitPrice = 0.10, totalPrice = 0.0;
        boolean isError = false;

        System.out.print("Mesafeyi giriniz: ");
        distance = input.nextInt();

        System.out.print("Yolcu yaşını giriniz: ");
        passengerAge = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-Tek Yön / 2-Gidiş Dönüş): ");
        flightType = input.nextInt();

        if ((distance > 0) && (passengerAge > 0) && ((flightType == 1) || (flightType == 2))) {
            if (flightType == 1) {
                if (passengerAge < 12) {
                    totalPrice = (unitPrice * distance * 0.5);
                } else if (passengerAge <= 24) {
                    totalPrice = (unitPrice * distance * 0.9);
                } else if (passengerAge >= 65) {
                    totalPrice = (unitPrice * distance * 0.7);
                } else {
                    totalPrice = (unitPrice * distance);
                }
            } else {
                if (passengerAge < 12) {
                    totalPrice = (unitPrice * distance * 0.5) * 2 * 0.8;
                } else if (passengerAge <= 24) {
                    totalPrice = (unitPrice * distance * 0.9) * 2 * 0.8;
                } else if (passengerAge >= 65) {
                    totalPrice = (unitPrice * distance * 0.7) * 2 * 0.8;
                } else {
                    totalPrice = (unitPrice * distance) * 2 * 0.8;
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            System.out.println("Toplam Bilet Tutarı: " + totalPrice + " TL'dir.");
        }
    }
}

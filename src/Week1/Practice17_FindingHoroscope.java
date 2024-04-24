package Week1;

import java.util.Scanner;

public class Practice17_FindingHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        int day, month;
        String horoscope = "";

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        if ((month >= 1) && (month <= 12)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if ((day >= 1) && (day <= 29)) {
                    if (day <= 19) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 20) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 20) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 22) {
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 22) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 22) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if ((day >= 1) && (day <= 30)) {
                    if (day <= 21) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 12) {
                if ((day >= 1) && (day <= 31)) {
                    if (day <= 21) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı değer girdiniz, yeniden deneyiniz!");
        } else {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}

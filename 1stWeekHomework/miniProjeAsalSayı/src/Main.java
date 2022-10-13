public class Main {

    public static void main(String[] args) {

        int number = -1;
        int remainder = number % 2; // bu fonksiyon sayımızın 2 ile bölümünden kalanını söylüyor.
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı Asal Değildir");
            return; // bu kodu burada sonlandırır devam etmesini engeller. Bunu yazmazsak aşağıdan 1 asal çıkar
        }
        if (number < 2) {
            System.out.println("Yanlış bir sayı girdiniz!");
            return;

        }

        for (int i = 2; i < number; i++) {
            if (number % 1 == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı Asal Değildir");
        } else {
            System.out.println("Sayı Asal Değildir");
        }


    }
}

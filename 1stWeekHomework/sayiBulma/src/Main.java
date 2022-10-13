public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranan = 41;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varMi = true;
                break;

            }
        }
        if (varMi) {
            System.out.println("Aradığınız sayı mevcut");
        } else {
            System.out.println("Aradığınız sayı mevcut değildir");
        }

    }
}

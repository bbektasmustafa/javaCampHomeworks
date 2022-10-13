public class Main {

    public static void main(String[] args) {
	sayiBulmaca();
    }
    public static void sayiBulmaca (){

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranan = 41;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varMi = true;
                break;

            }
        }
        String mesaj=" ";
        if (varMi) {
            mesaj = "Sayı mevcuttur : " +aranan;
            mesajVer(mesaj);
        } else {
            mesajVer("Sayı mevucut değildir: " +aranan);

        }


    }
    public static void mesajVer (String mesaj) {
        System.out.println(mesaj);
    }
}

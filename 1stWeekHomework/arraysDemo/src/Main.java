public class Main {

    public static void main(String[] args) {

        String ogrenci1 = "A";
        String ogrenci2 = "B";
        String ogrenci3 = "C";
        String ogrenci4 = "D";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------------");


        String[] ogrenciler = new String[4];
        ogrenciler[0] = "A";
        ogrenciler[1] = "B";
        ogrenciler[2] = "C";
        ogrenciler[3] = "D";

        for (int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

    }
}

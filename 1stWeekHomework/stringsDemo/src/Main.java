import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String mesaj = "Yar deyince kalem elden düşüyor.";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı: " + mesaj.length()); // bu mesajımızdaki eleman sayısını veriyor.
        System.out.println("21. Eleman: " + mesaj.charAt(20)); // bu istedigimiz sıradaki elemanı veriyo
        System.out.println(mesaj.concat(" Mihriban...")); // İstedigimiz bi kelimeyi ekliyor
        System.out.println(mesaj.startsWith("y"));
        System.out.println(mesaj.endsWith("."));
        char [] karakterler = new char[15];
        mesaj.getChars(0,15,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("i")); // saymasya baştan başlar
        System.out.println(mesaj.lastIndexOf("k")); // saymaya sondan başlar fakat sıra numarası olarak sağdan başlar */

        String yeniMesaj = mesaj.replace(' ', '-'); // bu fonksiyon karakter değişimi sağlıyor.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(10,28)); // bu fonksiyon istediğimiz aralıktaki değerleri veriyor.

        for(String kelime : mesaj.split(" ")){ //istediğimiz kısımdan kelimelere ayırıyoruz...
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //tüm karakterler küçük oluyor
        System.out.println(mesaj.toUpperCase()); //tüm karakterler büyük oluyor
        System.out.println(mesaj.trim()); //cümlenin başında sonunda boşluklar varsa onları alıyor...



    }
}

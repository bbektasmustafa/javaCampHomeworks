public class Main {

    public static void main(String[] args) {

        char grade = 'l';
        // grade not demek oraya istedigimizi yazabiliriz...
        switch (grade){
            case 'A' :
                System.out.println("Tebrikler Geçtiniz: Harf Notunuz A");
                break;
            case 'B' :
                System.out.println("Tebrikler Geçtiniz: Harf Notunuz B");
                break;

            case 'C' :
                System.out.println("Tebrikler Geçtiniz: Harf Notunuz C");
                break;
            case 'D' :
                System.out.println("Tebrikler Koşullu Geçtiniz: Harf Notunuz D");
                break;
            case 'F' :
                System.out.println("Maalesef Kaldınız: Harf Notunuz F");
                break;
            default:
                System.out.println("Hatalı not girdiniz");
                // default yukarıdakilerden farklı bir şey girilmesi durumunda çalışıyor.
                // her case sonunda break yamamız gerekli bitmesi için...

        }

    }
}

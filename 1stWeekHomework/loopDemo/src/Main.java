public class Main {

    public static void main(String[] args) {

        System.out.println("Rakamlar");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("----- For Döngüsü Bitti");
        System.out.println("Tek Rakamlar");
        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("----- While Döngüsü Bitti");
        System.out.println("Çift Rakamlar");
        int j = 2;
        do {
            System.out.println(j);
            j+=2;
    } while (j<10);
        System.out.println("----- Do-While Döngüsü Bitti");
    }

}

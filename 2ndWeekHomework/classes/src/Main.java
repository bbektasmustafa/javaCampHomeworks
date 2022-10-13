public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        int sayi1 = 10;
        int sayi2 = 15;
        sayi2 = sayi1;
        sayi1 = 21;
        System.out.println(sayi2); // Burada sonradan sayi 1 i değiştirmemiz bir şeyi etkilemiyor.

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 100;
        System.out.println(sayilar2[0]); // diziler referans tip oldukları için sonradan sayilar1 de yaptıgımız degisiklik etkiliyo



    }
}

public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());// Alttaki koddan farklı ama aynı işlev burada da değişiklik yapabiliriz
    //customerManager.customerDal = new OracleCustomerDal(); // Başka zaman başka şeye geçersek burayı değiştirmek yeterli
    customerManager.add();

    }
}

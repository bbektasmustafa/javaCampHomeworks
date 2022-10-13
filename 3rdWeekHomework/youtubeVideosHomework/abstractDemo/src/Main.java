public class Main {

    public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager();
    customerManager.databaseManager = new OracleDatabaseManager(); //İleride bunu değiştirmek istersek sadece bu kısmı değişmemiz yeterli
    customerManager.getCustomers();
    }
}

public class Main {

    public static void main(String[] args) {
	ProductManager productManager = new ProductManager();
    Product product = new Product();
    product.name = "Klavye";
    product.price = 20;

    productManager.add(product);
    }
}

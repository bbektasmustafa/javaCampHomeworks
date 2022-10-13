public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public boolean isValid(Product product){
    if (product.price>0 && !product.name.isEmpty()){ //Ünlem olmadığı manasına geliyor. yani zıttı
        return true;
    }else {
        return false;
    }
    }
    public void bisey(){

    }
}

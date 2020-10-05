public class Main {

    public static void main(String[] args) {
        Products greecha = new Products(1,"Greecha", 3);
        Products goroh = new Products(2,"Goroh", 2);
        Products molochko = new Products(3,"Moloko", 1);
      Shop shop = new Shop();
      shop.addNewProduct(greecha);
      shop.addNewProduct(goroh);
      shop.addNewProduct(molochko);
      shop.listOfProducts();
    }
}

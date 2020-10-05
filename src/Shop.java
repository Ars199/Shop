import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Products> shopProducts = new ArrayList<Products>();

    public void listOfProducts() {
        for (int i = 0; i < shopProducts.size(); i++) {
            shopProducts.get(i).show();
        }

    }

    public void addNewProduct(Products newProduct) {
        shopProducts.add(newProduct);
    }


}

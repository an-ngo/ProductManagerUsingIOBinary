package View;

import Controller.ProductManager;
import Controller.ReadProductFromFile;
import Controller.WriteProductToFile;
import Model.Product;


import javax.xml.xpath.XPath;
import java.io.EOFException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "productList.txt";
        ProductManager productManager = new ProductManager();

        try {
            productManager = ReadProductFromFile.readProductFromFile(path);
            Product product1 = new Product(1,"Intel","Sony",600,"White");
            productManager.addNewProduct(product1);
            while(true){
                DisplayMenu.displayMenu(productManager, path);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

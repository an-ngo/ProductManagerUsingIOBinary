package View;

import Controller.ProductManager;
import Controller.WriteProductToFile;
import Model.Product;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayMenu {
    public static void displayMenu(ProductManager productManager, String path) throws IOException {
        System.out.println("---------Menu---------");
        System.out.println("Input your choice: ");
        System.out.println("1: Add new product");
        System.out.println("2: Delete product");
        System.out.println("3: Search product");
        System.out.println("4: Display all productList");
        System.out.println("5: Display your cart");
        System.out.println("6: Quit");
        Scanner scannerLine = new Scanner(System.in);
        int input = scannerLine.nextInt();
        switch (input){
            case 1:
                addNewProduct(productManager,inputNewProduct());
                break;
            case 2:
                deleteProduct(productManager);
                break;
            case 3:
                displaySearchedProduct(productManager);
                break;
            case 4:
                displayAllProduct(productManager);
                break;
            case 5:
                displayUserCart(productManager);
                break;
            case 6:
                WriteProductToFile.writeProductToFile(productManager,path);
                System.exit(0);
        }
    }
    public static Product inputNewProduct(){
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
        System.out.println("ID product: "); int id = scannerInt.nextInt();
        System.out.println("Name product: "); String name = scannerLine.nextLine();
        System.out.println("Company : "); String company = scannerLine.nextLine();
        System.out.println("Price : "); int price = scannerInt.nextInt();
        System.out.println("Other description: "); String description = scannerLine.nextLine();
        return new Product(id,name,company,price,description);
    }
    public static void addNewProduct(ProductManager productManager, Product product){
        productManager.addNewProduct(product);
    }


    public static void deleteProduct(ProductManager productManager){
        displayAllProduct(productManager);
        System.out.println("Input index of product to delete");
        Scanner scannerInt = new Scanner(System.in);
        int index = scannerInt.nextInt();
        productManager.deleteProduct(index);
    }
    public static void displaySearchedProduct(ProductManager productManager){

    }
    public static void displayAllProduct(ProductManager productManager){
        System.out.println(productManager.toString());
    }
    public static void displayUserCart(ProductManager productManager){

    }
}

package Controller;

import Model.Product;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductManager implements Serializable {
    private ArrayList<Product> productArrayList = new ArrayList<>();

    public ArrayList<Product> getProductArrayList() {
        return this.productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    @Override
    public String toString() {
        String s="";
        for (Product product :
                productArrayList) {
            s+= product.toString()+" \n";
        }
        return "{" +
            " productArrayList='" +"\n" + s + "'" +
            "}";
    }

    public void addNewProduct(Product e){
        productArrayList.add(e);
    }
    public void deleteProduct(int index){
        productArrayList.remove(index);
    }
    public void displayAllProduct(){
        System.out.println(productArrayList.toString());
    }

}

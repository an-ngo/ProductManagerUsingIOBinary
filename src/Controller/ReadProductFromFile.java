package Controller;

import java.io.*;

public class ReadProductFromFile {
    public static ProductManager readProductFromFile(String path) throws IOException, ClassNotFoundException {
        File file = new File(path);
        if(file.length()>0){
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            ProductManager productManager = new ProductManager();
            productManager = (ProductManager) ois.readObject();
            ois.close();
            is.close();

            return productManager;
        }
        return new ProductManager();
    }
}

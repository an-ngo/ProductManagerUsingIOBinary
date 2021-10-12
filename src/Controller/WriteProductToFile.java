package Controller;

import java.io.*;

public class WriteProductToFile {
    public static void writeProductToFile(ProductManager productManager, String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(productManager);
        oos.close();
        os.close();
    }
}

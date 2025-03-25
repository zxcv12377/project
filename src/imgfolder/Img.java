package imgfolder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Img {
    public static void main(String[] args) {
        int data = 0;
        byte[] b = new byte[1024];

        try (FileInputStream img1 = new FileInputStream("C:/source/project/shop/src/imgfolder/dog.jpg");
                FileOutputStream fos = new FileOutputStream("C:/source/project/shop/src/imgfolder/dog1.jpg")) {
            while ((data = img1.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

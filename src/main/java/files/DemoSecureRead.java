package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DemoSecureRead {
    public static void main(String[] args) throws IOException {
        File fileObj=new File("D:\\Course backups\\Python\\Ganesh.java");

        FileInputStream fis=new FileInputStream(fileObj);
        InflaterInputStream iis=new InflaterInputStream(fis);

        byte[] arr=new byte[fis.available()];

        iis.read(arr);

        System.out.println(new String(arr));

        iis.close();
        fis.close();
    }
}

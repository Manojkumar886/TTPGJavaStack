package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoReading {
    public static void main(String[] args) throws IOException {
//        File fileObj=new File("D:\\Course backups\\Java\\thivin.txt");
        File fileObj=new File("D:\\Course backups\\Web\\MohanAgilan\\hyperlinks.html");
        FileInputStream fis=new FileInputStream(fileObj);

        int size=fis.available();
        byte[] tmp=new byte[size];
        // read and copy to byte array
        fis.read(tmp);

        String data=new String(tmp);
        System.out.println(data+" \n is the content available in the file "+fileObj.getAbsolutePath());

        fis.close();
    }
}

package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoWriting {
    public static void main(String[] args) throws IOException {
        File obj=new File("D:\\Course backups\\Java\\thivin.txt");
//        obj.createNewFile();
//        System.out.println(obj.getName()+" has created successfully");

        FileOutputStream fos=new FileOutputStream(obj);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type the content to store inside the file ");
        String content=scan.nextLine();
        fos.write(content.getBytes());

        System.out.println(obj.getName()+" file successfully written");
        fos.close();
        scan.close();
    }
}

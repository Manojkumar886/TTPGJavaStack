package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class DemoSecureWrite {
    public static void main(String[] args) throws IOException {
        File fileObj=new File("D:\\Course backups\\Python\\Ganesh.java");

        FileOutputStream fos=new FileOutputStream(fileObj);
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type the content to store inside the file ");
        String content="", answer="";
        while(true){
            content+=scan.nextLine();
            System.out.println("Do you wish to finish the code ");
            answer=scan.nextLine();
            if(answer.equalsIgnoreCase("okay"))
                break;
        }
        dos.write(content.getBytes());

        dos.close();
        fos.close();
        scan.close();
    }
}

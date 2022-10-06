package files;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileObj=new File("D:\\Course backups\\Java\\Gaja.doc");

        FileInputStream fis=new FileInputStream(fileObj);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Mobile tmp = (Mobile)ois.readObject();
        System.out.println(tmp.brand+" "+tmp.model+" "+tmp.prize+" "+tmp.internal+" "+tmp.ram);

        ois.close();
        fis.close();

//        FileOutputStream fos=new FileOutputStream(fileObj);
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        Mobile m1=new Mobile();
//        m1.brand="IQOO";m1.model="Z3";m1.prize=19200;m1.ram=8;m1.internal=128;
//
//        oos.writeObject(m1);
//
//        oos.close();
//        fos.close();
    }
}

// marked interface
class Mobile implements Serializable {
    transient String brand;
    String model;
    int prize;
    int ram,internal;
}
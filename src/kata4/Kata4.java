package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Kata4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        String path = "C:\\Users\\usuario\\Documents";
        File file = new File(path);
        String[] fileList = file.list();
        
        print(file.listFiles(),"");
        */
        
        String from = "C:\\Users\\usuario\\Downloads\\todo.pdf";
        String to = "C:\\Users\\usuario\\Downloads\\todo(1).pdf";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        byte[] buffer = new byte[1024];
        
        Date date = new Date();
        
        int read;
        while ((read = input.read(buffer))>= 0)
            output.write(buffer);
        input.close();
        output.close();
        
        System.out.println((new Date()).getTime() - date.getTime() + " msg");
    }
    
    public static void print(File[] fileList, String spaces){
        for (File f: fileList) {
            System.out.println(spaces + ((f.isDirectory()) ? "+": "")+ f.getName());
            if (f.isDirectory()) print(f.listFiles(), spaces + " ");
        }
    }
}

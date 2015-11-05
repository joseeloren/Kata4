package kata4;

import java.io.File;

public class Kata4 {
    public static void main(String[] args) {
        String path = "C:\\Users\\usuario\\Documents";
        File file = new File(path);
        String[] fileList = file.list();
        
        print(file.listFiles(),"");
    }
    
    public static void print(File[] fileList, String spaces){
        for (File f: fileList) {
            System.out.println(spaces + ((f.isDirectory()) ? "+": "")+ f.getName());
            if (f.isDirectory()) print(f.listFiles(), spaces + " ");
        }
    }
}

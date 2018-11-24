package week9;

import java.io.*;

public class Utils {
    //
    public static String readContentFromFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        reader.close();
        return line;
    }
    public static void writeContentToFile1(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String line = "ahihi";
        writer.write(line);
        writer.newLine();
        writer.close();
    }

    public static void writeContentToFile2(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        String line = "ahihi23233";
        writer.write(line);
        writer.close();
    }
    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File done = null;
        if (file.exists()) {
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    if (fileName.equals(f.getName()))
                        done = f;
                        break;
                }
            }
        }
        return done;
    }
    public static void main(String [] args) throws IOException {
        Utils utils = new Utils();
        String test1 = utils.readContentFromFile("C:\\GitHub\\oop2018\\src\\week9\\ahihi.txt");
        System.out.println(test1);

        //Ghi đè (overload)
        writeContentToFile1("C:\\GitHub\\oop2018\\src\\week9\\ghi.txt");
        //Ghi nối thêm vào (append)
        writeContentToFile2("C:\\GitHub\\oop2018\\src\\week9\\ghi.txt");

        //Tìm file theo đường dẫn
        if(findFileByName("C:\\GitHub\\oop2018\\src\\week9", "ahihi.txt").exists())
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}

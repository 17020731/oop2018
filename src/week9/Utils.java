package week9;

import java.io.*;

public class Utils {
    //
    public static String readContentFromFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        return line;
    }
    public static void writeContentToFile1(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String line = "ahihi";
        writer.write(line);
    }

    public static void writeContentToFile2(String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        String line = "ahihi";
        writer.write(line);
    }
    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File done = null;
        if (file.exists()) {
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    if (fileName.equals(f.getAbsolutePath()))
                        done = f;
                        break;
                }
            }
        }
        return done;
    }
}

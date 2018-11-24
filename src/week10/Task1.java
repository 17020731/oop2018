package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {


    public List<String>getAllFunctions(File path){
        ArrayList<String> líst = new ArrayList<>();
        BufferedReader reader;
        String s;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((s = reader.readLine()) != null){
                if(s.contains("static")){
                    líst.add(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return líst;
    }
    public String findFunctionByName(String name){
        return null;
    }
    public static void main(String [] args) throws IOException {
        Task1 test = new Task1();
        List<String> arr;
        arr = test.getAllFunctions(new File("C:\\GitHub\\oop2018\\src\\week9\\Utils.java"));
        for(String s : arr)
            System.out.println(s);
    }

}

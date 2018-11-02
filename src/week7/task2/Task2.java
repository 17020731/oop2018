package week7.task2;

import week5_6.Circle;
import week5_6.Square;

import java.io.*;

public class Task2 {
    public void Nullpointer() throws NullPointerException{
        String name = null;
        System.out.println(name.equalsIgnoreCase("Hiep"));  //Xảy ra ngoại lệ NullPointerException khi name = null
    }
    public void arrayOutOfBound() throws ArrayIndexOutOfBoundsException{
        int [] arr = {0, 1, 2, 3, 4};
        System.out.println(arr[6]); //Bắt ngoại lệ ArrayOutOfBoundsException khi truy xuất vượt quá phần tử của mảng
    }

    public void airthmetic() throws ArithmeticException{
        System.out.println(15/0); //Bắt ngoại lệ ArithmeticException khi chia cho số 0
    }
    public void classCast() throws ClassCastException{
        Object c = new Circle();
        Square s = (Square) c;  //Bắt ngoại lệ ClassCastException
    }
    public void filenotfound() throws FileNotFoundException{
        BufferedReader reader1 = new BufferedReader(new FileReader("hiep.txt")); //Bắt ngoại lệ FileNotFoundException khi đọc mà không thấy file
    }
    public void ioExcept() throws IOException{
        BufferedReader reader2= new BufferedReader(new FileReader("C:\\GitHub\\oop2018\\src\\week7\\task2\\123.txt"));
        double c = reader2.read();
        System.out.println(c);
    }
    public static void main(String [] args) throws IOException {
        Task2 test = new Task2();
        /**
         * bắt ngoại lệ NullPointerException
         */
        try{
            test.Nullpointer();
        }catch (NullPointerException e){
            System.out.println("Lỗi so sánh null");
            //e.printStackTrace();
        }

        /**
         * bắt ngoại lệ ArrayOutOfBoundException
         */
        try{
            test.arrayOutOfBound();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi truy xuất mảng");
            //e.printStackTrace();
        }
        /**
         * bắt ngoại lệ ArithmeticException
         */
        try {
            test.airthmetic();
        }catch (ArithmeticException e){
            System.out.println("Lỗi logic");
            //e.printStackTrace();
        }
        /**
         * bắt ngoại lệ ClassCastException
         */
        try {
            test.classCast();
        }catch (ClassCastException e){
            System.out.println("Lỗi ép kiểu");
            //e.printStackTrace();
        }
        /**
         * bắt ngoại lệ FileNotFoundException
         */
        try {
            test.filenotfound();
        }catch (FileNotFoundException e){
            System.out.println("Lỗi không tìm được file");
            //e.printStackTrace();
        }
        /**
         * Bắt ngoại lệ IOException
         */
        try{
            test.ioExcept();
        }catch (IOException e){
            System.out.println("Lỗi Input - Output");
            //e.printStackTrace();
        }
    }

}

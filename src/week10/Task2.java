package week10;

public class Task2 {
    private final static int n = 1000;
    private static double [] arr = new double[n];
    public static void init(){
        for(int i = 0; i < n; i++){
            arr[i] =  Math.random();
        }
    }
    public static void bubbleSort(){
        init();
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1; j++){
                if(arr[j]  > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print();
    }
    public static void print(){
        for(double c: arr)
            System.out.println(c);
    }
    public static void main(String [] args){
        bubbleSort();
    }

}


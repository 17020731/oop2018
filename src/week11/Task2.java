package week11;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static <T extends Comparable> T FindMax(ArrayList<T> arrayList) {
        T max = arrayList.get(0);
        for(int i = 0; i < arrayList.size(); i++) {
            if(max.compareTo(arrayList.get(i)) < 0)
                max = arrayList.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++)
            arrayList.add(random.nextInt(100));
        for(int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
        System.out.println(FindMax(arrayList));

    }
}

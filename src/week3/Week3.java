package week3;

public class Week3 {

    public static int max(int m, int n) {
        return (m>n?m:n);
    }

    public static int minOfArray(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++)
            if(array[i] < min)
                min = array[i];

         return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if(BMI < 18.5)
            return "Thiếu cân";
        else if(BMI >=18.5 && BMI < 23)
            return "Bình thường";
        else if(BMI >= 23 && BMI <= 25)
            return "Thừa cân";
        else
            return "Béo phì";
    }
}

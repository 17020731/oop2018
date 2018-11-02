package week7.task1;

public class ExpressionTest {
    public static void main(String[]args){

        Numeral n1 = new Numeral(10);
        Numeral n2 = new Numeral(1);
        Numeral n3 = new Numeral(2);
        Numeral n4 = new Numeral(3);

        try{
            Square s = new Square(n1);
            Subtraction sub = new Subtraction(s, n2);
            Multiplication mul = new Multiplication(n3, n4);
            Addition add = new Addition(sub, mul);
            Square s2 = new Square(add);
            System.out.println(s2 + " = " + s2.evaluate() + "\n");
            System.out.println(new Division(n1, new Numeral(0)).evaluate());
        }catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0");
        }
    }
}

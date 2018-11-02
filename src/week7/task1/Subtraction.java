package week7.task1;

public class Subtraction extends BinaryExpression {
    public Subtraction(Expression a, Expression b){
        left = a;
        right = b;
    }

    @Override
    public int evaluate() {
        return left.evaluate()-right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString()+"-"+right.toString() + ")";
    }
}

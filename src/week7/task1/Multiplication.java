package week7.task1;

public class Multiplication extends BinaryExpression{

    public Multiplication(Expression l, Expression r){
        left = l;
        right = r;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString()+"*"+right.toString()+ ")";
    }
}

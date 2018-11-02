package week7.task1;

public class Division extends BinaryExpression{
    public Division(Expression a, Expression b){
        left = a;
        right = b;
    }
    @Override
    public int evaluate() {
        return left.evaluate()/right.evaluate();
    }

    @Override
    public String toString() {
        return "(" +left.evaluate()+"/"+right.evaluate() + ")";
    }
}



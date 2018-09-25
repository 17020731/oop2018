package week2;

public class Fraction {
    Task1 test = new Task1();
    private int numberator, denominator;

    public Fraction() {
    }

    public Fraction(int numberator, int denominator) {       //contructor cho phan so
        this.numberator = numberator;
        this.denominator = denominator;
    }
    public Fraction Toigian(){
        int Uoc = test.gcd(numberator,denominator);
        this.numberator /= Uoc;
        this.denominator/= Uoc;
        return this;
    }

    public Fraction add(Fraction other) {
        Fraction sum = new Fraction();
        sum.numberator = this.numberator*other.denominator+this.denominator*other.numberator;
        sum.denominator = this.denominator*other.denominator;
        sum.Toigian();
        return sum;
    }

    public Fraction subtract(Fraction other) {
        Fraction sub = new Fraction();
        sub.numberator = this.numberator*other.denominator-this.denominator*other.numberator;
        sub.denominator = this.denominator*other.denominator;
        sub.Toigian();
        return sub;
    }

    public Fraction multiply(Fraction other) {
        Fraction multi = new Fraction();
        multi.numberator = this.numberator*other.numberator;
        multi.denominator = this.denominator*other.denominator;
        multi.Toigian();
        return multi;
    }

    public Fraction divide(Fraction other) {
        Fraction div = new Fraction();
        div.numberator = this.numberator*other.denominator;
        div.denominator = this.denominator*other.numberator;
        div.Toigian();
        return div;
    }

    public void Out(){
        System.out.println("Phan so la: ");
        if(denominator == 0)
            System.out.println("Wrong!");
        else if(denominator == 1)
            System.out.println(numberator);
        else if(denominator < 0){
            if(numberator < 0)
                System.out.println(numberator + "/" + denominator);
            else
                System.out.println(numberator*-1 + "/" + denominator*-1);
        }
        else
            System.out.println(numberator + "/" + denominator);
    }
    public boolean equals(Fraction other){
        return (this.numberator*other.denominator == this.denominator*other.numberator);
    }

    public static void main( String[] args){
        Fraction frac1 = new Fraction(101,2);
        Fraction frac2 = new Fraction(3,2);
        Fraction sum = frac1.add(frac2);
        Fraction subtr = frac1.subtract(frac2);
        Fraction divi = frac1.divide(frac2);
        Fraction mul = frac1.multiply(frac2);
        sum.Out();
        subtr.Out();
        divi.Out();
        mul.Out();
    }
}

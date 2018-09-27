package week2.task2;

public class Fraction {
    Task1 test = new Task1();
    private int numerator, denominator;
    //getter and setter
    public int getDenominator() {
        return denominator;
    }

    public int getnumerator() {
        return numerator;
    }

    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    //Contructor
    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Toi gian
    public Fraction Toigian(){
        int Uoc = test.gcd(numerator,denominator);
        this.numerator /= Uoc;
        this.denominator/= Uoc;
        return this;
    }

    //
    public Fraction add(Fraction other) {
        Fraction sum = new Fraction();
        sum.numerator = this.numerator*other.denominator+this.denominator*other.numerator;
        sum.denominator = this.denominator*other.denominator;
        sum.Toigian();
        return sum;
    }

    public Fraction subtract(Fraction other) {
        Fraction sub = new Fraction();
        sub.numerator = this.numerator*other.denominator-this.denominator*other.numerator;
        sub.denominator = this.denominator*other.denominator;
        sub.Toigian();
        return sub;
    }

    public Fraction multiply(Fraction other) {
        Fraction multi = new Fraction();
        multi.numerator = this.numerator*other.numerator;
        multi.denominator = this.denominator*other.denominator;
        multi.Toigian();
        return multi;
    }

    public Fraction divide(Fraction other) {
        Fraction div = new Fraction();
        div.numerator = this.numerator*other.denominator;
        div.denominator = this.denominator*other.numerator;
        div.Toigian();
        return div;
    }

    public void Out(){
        System.out.println("Phan so la: ");
        if(denominator == 0)
            System.out.println("Wrong!");
        else if(denominator == 1)
            System.out.println(numerator);
        else if(denominator < 0){
            if(numerator < 0)
                System.out.println(numerator + "/" + denominator);
            else
                System.out.println(numerator*-1 + "/" + denominator*-1);
        }
        else
            System.out.println(numerator + "/" + denominator);
    }


    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        if(this.numerator * ((Fraction) obj).denominator != this.denominator*((Fraction) obj).numerator )
            return false;
        return true;
    }

    public static void main( String[] args){
        Fraction frac1 = new Fraction(101,2);
        Fraction frac2 = new Fraction(3,2);
        Fraction sum = frac1.add(frac2);
        Fraction subtr = frac1.subtract(frac2);
        Fraction divi = frac1.divide(frac2);
        Fraction mul = frac1.multiply(frac2);
        if(frac1.equals(frac2))
            System.out.println("Bang nhau");
        else
            System.out.println("Khong bang nhau");
        sum.Out();
        subtr.Out();
        divi.Out();
        mul.Out();

    }
}
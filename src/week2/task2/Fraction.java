package week2.task2;

public class Fraction {

    private int numberator, denominator;

    public Fraction(int numerator, int denominator) {       //contructor cho phan so
        this.numerator = numberator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        this.numerator = this.numerator*other.denominator+this.denominator*other.numerator;         
        this.denominator = this.denominator*other.denominator;
        return this;
    }

    public Fraction subtract(Fraction other) {
        this.numerator = this.numerator*other.denominator-this.denominator*other.numerator;
        this.denominator = this.denominator*other.denominator;
        return this;
    }

    public Fraction multiply(Fraction other) {
        this.numerator = this.numerator*other.numerator;
        this.denominator = this.denominator*other.denominator;
        return this;
    }

    public Fraction divide(Fraction other) {
        this.numerator = this.numerator*other.denominator;
        this.denominator = this.denominator*other.numerator;
        return this;
    }

    public boolean equals(Fraction other){
        return (this.numerator*other.denominator == this.denominator*other.numberator);
    }
}

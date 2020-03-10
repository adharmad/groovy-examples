// class to represent fractional operations and operator overloading

class Fraction {
    int num
    int den

    Fraction(num, den) {
        this.num = num
        this.den = den
    }

    boolean equals(Fraction f) {
        return (f.num == num) && (f.den == den)
    }

    Fraction plus(Fraction f) {
        def n = f.num * den + f.den * num
        def d = f.den * den

        return new Fraction(n, d)
    }


    Fraction minus(Fraction f) {
        def n = f.den * num - f.num * den
        def d = f.den * den

        return new Fraction(n, d)
    }

    Fraction multiply(Fraction f) {
        def n = f.num * num
        def d = f.den * den

        return new Fraction(n, d)
    }

    Fraction div(Fraction f) {
        def n = f.den * num
        def d = f.num * den

        return new Fraction(n, d)        
    }

    void print() {
        println "${num}/${den}"
    }
}


f1 = new Fraction(1, 2)
f2 = new Fraction(3, 4)

f1.print()
f2.print()

f3 = f1 + f2
f3.print()

f4 = f1 - f2
f4.print()

f5 = f1 * f2
f5.print()

f6 = f1/f2
f6.print()



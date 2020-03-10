// complex class demonstrating operator overloading
class Complex {
    def re, im

    def plus(other) {
        new Complex(re: re + other.re, im: im + other.im)
    }

    String toString() {
        "$re ${im > 0 ? '+' : '-' } ${im}i" 
    }
}

c1 = new Complex(re: 1, im: 2)
c2 = new Complex(re: 3, im: 4)

println c1 + c2

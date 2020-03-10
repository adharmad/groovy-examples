// complex numbers class

class Complex {
    int real
    int imag

    Complex(real, imag) {
        this.real = real
        this.imag = imag
    }

    boolean equals(Complex c) {
        return (c.real == real) && (c.imag = imag)
    }

    Complex conjugate() {
        return new Complex(real, -imag)
    }

    Complex plus(Complex c) {
        def r = c.real + real 
        def i = c.imag + imag

        return new Complex(r, i)
    }

    Complex minus(Complex c) {
        def r = real - c.real
        def i = imag - c.imag 

        return new Complex(r, i)
    }

    Complex multiply(Complex c) {
        def r = (real * c.real) - (imag * c.imag)
        def i = (real * c.imag) + (imag * c.real)

        return new Complex(r, i)
    }

    Complex div(Complex c) {
        Complex c1 = multiply(c.conjugate())
        int d = c.real ** 2 + c.imag ** 2
        return new Complex(c1.real/d, c1.imag/d)
    }

    void print() {
        if (imag >= 0) {
            println "${real} + i${imag}"
        } else {
            def i = -imag
            println "${real} - i${i}"
        }
    }
}

f1 = new Complex(1, 2)
f2 = new Complex(3, 4)

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



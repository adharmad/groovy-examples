// try some inheritance

class A {
    int i
    A(ii) {
        i = ii
    }

    void print() {
        println "i = ${i}"
    }
}

class B extends A {
    int j
    B(jj) {
        super(0)
        j = jj
    }

    B(ii, jj) {
        super(ii)
        j = jj
    }

    void print() {
        super.print()
        println "j = ${j}"
    }
}


b = new B(1, 2)
b.print()

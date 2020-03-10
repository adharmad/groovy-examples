class A {
    int i
    int j

    A(ii, jj) {
        i = ii
        j = jj
    }

    void print() {
        println "i = ${i}, j = ${j}"
    }

}

a = new A(1, 2)
a.print()

a.i = 3
a.j = 4
a.print()

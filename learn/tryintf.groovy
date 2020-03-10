// try implementing interfaces

interface A {
    String foo(String a, String b);
    int boo(int x, int y, int z);
}

class B implements A {
    def p, q
    
    B(pp, qq) {
        p = pp
        q = qq
    }

    String foo(String a, String b) {
        return a + b
    }

    int boo(int x, int y, int z) {
        return x + y + z
    }
}

b = new B(1, 2)
println b.foo("amol", "dharma")
println b.boo(5, 6, 7)

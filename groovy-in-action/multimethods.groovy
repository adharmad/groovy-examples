class A {
    static void test(B b) {
        println "we got b"
    }

    static void test(C c) {
        println "we got c"
    }

    static void test(Object o) {
        println "we got object"
    }
}

class B {}
class C {}

def b = new B()
def c = new C()
def i = 10

A.test(b)
A.test(c)
A.test(i)

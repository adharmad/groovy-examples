// try an interface
interface I {
    void foo()
    void boo()
}

class C implements I {
    C() {
        println "creating C"
    }

    void foo() {
        println "foo"
    }

    void boo() {
        println "boo"
    }
}

c = new C()
c.foo()
c.boo()

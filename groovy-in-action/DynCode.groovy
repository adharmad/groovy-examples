// invoke code dynamically

class Foo {
    def a, b
    Foo() {
        println "invoking constructor"
    }

    Foo(aa, bb) {
        println "invoking overloaded constructor"
        a = aa
        b = bb
    }

    def fox() {
        println "fox method"
    }

    def hen() {
        println "hen method"
    }
}

def s1 = "fox"
def s2 = "hen"
def f = new Foo()
f."$s1"()
f."$s2"()

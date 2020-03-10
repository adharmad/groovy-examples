// try static variables
// static variables not working

class Foo {
    //static {
    //    a = 10
    //    b = 20
    //}

    // instance variables
    c
    d
    a
    b

    test1() {
        println "a = ${a}, b = ${b}, c = ${c}, d = ${d}"
    }
}

f = new Foo()
f.test1()

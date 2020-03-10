class Foo {
    int a
    int b
    
    void print() {
        println ("a = ${a}, b = ${b}")
    }
}

f = new Foo(b:10, a:20)
f.print()

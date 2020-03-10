class C {
    int i = 10
    String s = "foo"
    float f = 1.1

    C() { }
    def foo() {}
    def boo() {}
    def doo() {}
    def zoo() {}
}

C c = new C()
println c.class
c.class.methods.each {m ->
    println m
}

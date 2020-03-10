// a complex example with closure and classes

class A {
    int field = 1
    int foo() {
        return 2
    }

    Closure create(param) {
        def local = 3
        def closure = {caller ->
                [this, field, foo(), local, param, caller]
        }
        return closure
    }
}

A a = new A()
closure = a.create()
context = closure.call(this)

println context

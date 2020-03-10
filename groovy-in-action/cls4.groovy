// different types of constructors

class A {
    String name, product

    A(n, p) {
        name = n
        product = p
    }
}

def a1 = new A('hello', 'world')
def a2 = ['hello', 'world'] as A
A a3 = ['hello', 'world']

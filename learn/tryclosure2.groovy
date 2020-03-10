// functions and closures

c1 = {
    println ("Hello ${it}") 
}

def func1(String name, Closure c) {
    c.call(name)
}

func1("Amol", c1);

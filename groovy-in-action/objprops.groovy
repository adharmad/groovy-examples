// get and print properties of an object

class X {
    int i = 0
    int j = 0
    X() { }
}

X x = new X()

x.properties.each {prop ->
        println "${prop.key} => ${prop.value}"
}

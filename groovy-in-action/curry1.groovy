// closure and curry

def adder = {x, y ->
    return x+y
}

def addOne = adder.curry(1)

println addOne(100)

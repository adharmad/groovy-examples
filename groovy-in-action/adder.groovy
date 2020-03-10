// adder closure

def adder = { x, y ->
    x + y
}

println adder(3, 4)
println adder(5, 6)

def addTwo = adder.curry(2)
def addFive = adder.curry(5)

println addTwo(10)
println addFive(11)

// times
def sum = 0
def i = 0
10.times {
    i++
    sum += i
}

println sum

// upto
1.upto(10) { number ->
        println number
}

// downto
10.downto(1) { number ->
        println number
}

// step
0.step(2.0, 0.1) { number ->
        println number
}


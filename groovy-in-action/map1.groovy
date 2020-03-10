m1 = [a:1, b:2, c:3]

println m1
println m1['a']

println m1.keySet()

m1['d'] = 4
m1.e = 5

println m1

m1.each { entry ->
    println "${entry.key} => ${entry.value}"
}

abMap = m1.subMap(['a', 'b'])
println abMap

def m2 = m1.collect { entry ->
    entry.value *= 2
}

println m2

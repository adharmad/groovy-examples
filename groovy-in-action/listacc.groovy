// list accumulation

lst1 = ['a', 'b', 'c']
def s = lst1.join('=')
println s

lst2 = [1, 2, 3, 4, 5, 6]
println lst2.sum()

fact = lst2.inject(1) { fac, item ->
    fac *= item
}

println fact

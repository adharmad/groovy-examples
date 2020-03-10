// some advanced closure and list examples
count = 0
last = 0
lst = [1, 2, 3, 4, 5]

lst.each {count += it; last = it}

println ("Count = ${count} and last item = ${last}")

// multiply each element of lst by 7
lst2 = lst.collect {it * 7}
println lst2

// filter a list using find. all elements divisible by 2
lst3 = lst2.findAll {it % 2 == 0}
println lst3

// max/min functions
println lst2.max()
println lst2.min()

// join functions
val = lst.join(' -- ')
println val

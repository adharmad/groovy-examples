// more listops
lst1 = [1, 2, 3, [4, 5, [7, 8, 9]]]
lst2 = lst1.flatten()
println lst2

// intersect
lst3 = [1, 2, 3].intersect([1, 3, 4])
println lst3

// disjoint
def x = [1, 2, 3].disjoint([4, 5, 6])
println x

lst4 = [1, 2, 3, 4]
println lst4.pop()
println lst4.pop()
println lst4.pop()
println lst4.pop()
// this will throw NoSuchElementException
// println lst4.pop()

lst5 = [3, 5, 7, 1, 3]
println lst5.sort()

// some more list methods

lst1 = [1, 2, [3, 4, [5, 6, [7, 8]]]]
lst2 = lst1.flatten()
println lst2

lst3 = [1, 2, 3]
lst4 = [2, 3, 4, 5]
println lst3.intersect(lst4)
assert [1, 2, 3].disjoint([5, 6, 7])

// pop
lst5 = ['a', 'b', 'c', 'd', 'e']
while ((lst5.pop()) != null) {
    println lst5
    if (lst5 == []) {
        break
    } 
}

// sort a list
lst6 = ['kashmira', 'madhura', 'shruti', 'payal', 'amruta']
println lst6.sort()
println lst6.sort().reverse()[0]

// try sorting lists by various criterion
def lst1 = [3, 0, 5, 6]
def lst2 = [2, 1, 0, 9, 4]
def lst3 = [lst1, lst2]

println lst3

// comparing lists by their first element
lst4 = lst3.sort { a, b ->
    a[0] <=> b[0]
}

println lst4

// comparing lists by their size
lst5 = lst3.sort {item ->
    item.size
}

println lst5

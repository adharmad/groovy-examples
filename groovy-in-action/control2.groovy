def lst = ['a', 'b', 'c', 'd', 'e']

for (elem in lst) {
    println elem
}

count = 0
lst.each {
    count++
        println "${it}${count}"
}

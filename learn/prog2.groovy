// try list

lst = [1, 2, 3]

for (i in lst) {
    println i
}

lst1 = [1, new java.util.Date(), "hello world!"]

for (i in lst1) {
    println i
}

assert lst1.size() == 3
assert lst[0] == 2


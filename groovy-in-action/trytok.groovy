// tokenize a complete file

def s = ""

new File('c:/tmp/test.txt').eachLine {
    s += ' ' + it
}

// println s

def lst = s.tokenize(' \n')
def map1 = [:]

lst.each { it ->
    if (map1.containsKey(it)) {
        map1.put(it, map1.get(it) + 1)
    } else {
        map1.put(it, 1)
    }
}

map1.each {key, val ->
    println "${key} ==> ${val}"
}

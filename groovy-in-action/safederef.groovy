def map = [a:[b:[c:1]]]

println map.a.b.c

try {
    println map.a.x.c
} catch (NullPointerException e) {
    println "caught NPE"
}

// safe dereferencing
println map?.a?.x?.c

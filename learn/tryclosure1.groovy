// closures and operations on them

c = {println "haha"}

println "calling closure"
c.call()
println "after calling"

// closure with default arguments
c1 = {println("hello ${it}")}

c1.call("Amol")
c1.call("Vishal")

// closure with non-default arguments
c2 = {p1 -> 
        println "Hello ${p1}"
}
c2.call("Madhura")

// more parameters
c3 = {p1, p2, p3 -> 
        println "p1 = " + p1 + ", p2 = " + p2 + ", p3 = " + p3
}

c3.call(1, 2, 3)

// more closures (list examples)
[1, 2, 3, 4].each {println it}

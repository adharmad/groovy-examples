def str = "To be or not to be" // this is a GString

println str.length()

for (ch in str) {
    println ch
}

// more string ops
greeting = "Hello Groovy!"
println greeting
greeting -= "Hello"
println greeting
greeting = "Hi" + greeting
println greeting

// padding operations
println 'x'.padLeft(3) 
println 'x'.padRight(5, '_')
println 'x' * 7
println 'x'.center(9)

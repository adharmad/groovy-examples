// In java, the following pattern is followed commonly
// if (var != null) {
//      do something with var
// }
//
// In groovy, the ? operator is a shortcut for testing if the operand
// is null
//  var?.method()
// will invoke the method only if var is not null

def foo(s) {
    s?.reverse()
}

println foo('dharmadhikari')
println foo(null)

// accessing and modifying class fields using [] notation

class Foo {
    String s1, s2
    Foo(s1, s2) {
        this.s1 = s1
        this.s2 = s2
    }

    void print() {
        println "$s1 $s2"
    }
}

Foo f = new Foo("amol", "dharma")
f.print()
println f['s1']
println f['s2']
f['s1'] = "kashmira"
f.print()

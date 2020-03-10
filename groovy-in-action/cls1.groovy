class Author {
    String fname
    String lname

    Author(fname, lname) {
        this.fname = fname
        this.lname = lname
    }

    String toString() {
        fname + " " + lname
    }
}

class Book {
    List authorList
    String name

    Book(name, lst) {
        this.name = name
        this.authorList = lst
    }

    String toString() {
        def s = "Book: ${name}\nAuthors:\n"
        authorList.each {
            s += "\t" + it + "\n"
        }
        return s
    }

}

a1 = new Author("somerset", "maughm")
a2 = new Author("jk", "rowling")
a3 = new Author("greg", "iles")

lst = [a1, a2, a3]

lst.each {
    println it
}

b = new Book("how to do it", lst)
println b

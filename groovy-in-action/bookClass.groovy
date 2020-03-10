class Book {
    String title

    Book(String theTitle) {
        title = theTitle
    }

    String toString() {
        "Title = ${title}"
    }
}


b = new Book("Pygmalion")
println b
println b.toString().reverse()

try {
    e = new Exception("hello")
    throw e
} catch (Exception e) {
    e.printStackTrace()
    println "message = " + e.message
}

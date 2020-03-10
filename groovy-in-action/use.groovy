class StrOps {
    static def plus(String self, String op) {
        try {
            return self.toInteger() + op.toInteger()
        } catch (Exception e) {
            return 0
        }
    }
}

use(StrOps) {
    def x =  "1" + "2"
    println x
}

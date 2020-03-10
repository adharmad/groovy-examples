class MyBean {
    public int val

    MyBean(v) {
        val = v
    }

    int getVal() {
        val * 2
    }

    def setVal(v) {
        val = v
    }
}

b = new MyBean(10)
println b.getVal()
println b.@val

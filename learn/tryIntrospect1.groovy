def className = "A"

def a = Class.forName(className).newInstance()
a.foo()

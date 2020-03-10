// try introspection using groovy
c = Class.forName("java.lang.String").getClass()

//fields = c.getFields()
//for (f in fields) {
//    println f
//}

//methods = c.getMethods()
//for (m in methods) {
//    println m
//}

constParamTypes = [String.class]
constParams = ["hello world"]
constructor = c.getConstructor(constParamTypes)
strObj = constructor.newInstance(constParams)

methodParamTypes = [String.class]
methodParams = ["to be or not to be"]
method = c.getMethod("concat", methodParamTypes)

retVal = method.invoke(strObj, methodParams)

println retVal

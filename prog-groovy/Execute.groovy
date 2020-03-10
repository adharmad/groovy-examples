// In java, to invoke an external command, you need to get an instance
// of Runtime and then invoke the exec method on it.
// Runtime.getRuntime.exec()
// In groovy, its much simpler

println "pslist".execute().text
println "pslist".execute().getClass().name

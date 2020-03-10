// file io (writing)

import java.io.*

filename = this.args[0]
println "Opening file ${filename}"

f = new File(filename)
if (!f.exists()) {
    println "Creating new file"
    f.createNewFile()
}


fout = new BufferedWriter(new FileWriter(f))

fout.writeLine("this is a test")
fout.writeLine("hello world")
fout.writeLine("just do it")

fout.close()


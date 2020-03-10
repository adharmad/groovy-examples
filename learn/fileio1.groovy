// file io

import java.io.*

filename = this.args[0]
println "Opening file ${filename}"

fin = new BufferedReader(new FileReader(filename))
line = ""

while ((line = fin.readLine()) != null) {
    println "${line}"
}

fin.close()


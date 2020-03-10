// calculate MD5 checksum of a file
//

import java.security.*
import java.io.*
import java.util.prefs.*

file = new File('FileMD.groovy')


md = MessageDigest.getInstance("SHA1")
file.eachLine { line ->
    md.update(line.getBytes(), 0, line.length())
}

raw = md.digest()
b64 = Base64.byteArrayToBase64(raw)

println b64


// SecretWriting
// Usage:
//      groovy.bat SecretWriting.groovy -e|-d text

import java.io.*
import java.security.*
import javax.crypto.*
import java.util.prefs.*

if (args.length < 2) {
    println "Usage: groovy.bat SecretWriting.groovy -e|-d text"
    System.exit(0);
}

// Get or create a Key
Key key
try {
    def oin = new ObjectInputStream(new FileInputStream("SecretKey.ser"))
    key = (Key)oin.readObject();
    oin.close()
} catch (FileNotFoundException e) {
    def keygen = KeyGenerator.getInstance("DES")
    keygen.init(new SecureRandom())
    key = keygen.generateKey()
    def out = new ObjectOutputStream(new FileOutputStream("SecretKey.ser"))
    out.writeObject(key)
    out.close()
}

// Get a Cipher
def cipher = Cipher.getInstance("DES/ECB/PKCS5Padding")
def buf = ""

if (args[0] == "-e") {
    cipher.init(Cipher.ENCRYPT_MODE, key)
    (1..args.length-1).each {
        buf += " " + args[it]
    }

    def stringBytes = buf.getBytes("UTF8")
    def raw = cipher.doFinal(stringBytes)
    def b64 = Base64.byteArrayToBase64(raw)
    println b64
} else if (args[0] == "-d") {
    cipher.init(Cipher.DECRYPT_MODE, key)
    def raw = Base64.base64ToByteArray(args[1])
    def stringBytes = cipher.doFinal(raw)
    buf = new String(stringBytes, "UTF8")
    println buf
}

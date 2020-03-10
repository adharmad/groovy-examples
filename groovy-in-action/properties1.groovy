// try to read a properties file

import java.util.*

filename = "foo.props"
p = new Properties()
p.load(new FileInputStream(filename))

println p





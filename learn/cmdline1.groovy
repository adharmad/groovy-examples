// try other variation of cmdline

def buf = ""

(2..args.length-1).each {
    buf += args[it]    
}

println buf

def code = '1 + '
code += System.getProperty('os.version')
println code
println evaluate(code)

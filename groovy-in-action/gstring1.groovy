me = 'Tarzan'
you = 'Jane'

line = "me $me - you $you"
assert line == 'me Tarzan - you Jane'
println line

def date = new Date(0)
line1 = "Year $date.year Month $date.month Day $date.date"
println line1

println "GMT Date : ${date.toGMTString()}"

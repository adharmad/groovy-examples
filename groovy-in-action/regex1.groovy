line = 'she sells sea shells at the sea shore of seychelles'

// line contains a substring starting with s and ending with a having 
// 3 characters
assert line =~ /s.a/

finder = (line =~ /s.a/)
assert finder instanceof java.util.regex.Matcher

// assert that line contains only words separated by space
assert line ==~ /(\w+ \w+)*/
WORD = /\w+/
matches = (line ==~ /($WORD $WORD)*/)
assert matches instanceof java.lang.Boolean

assert (line ==~ /s.e/) == false

wordsByX = line.replaceAll(WORD, 'x')
assert wordsByX == 'x x x x x x x x x x'

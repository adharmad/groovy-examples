def today = new Date()
def fewDaysAgo = today - 10

for (d in fewDaysAgo..today) {
    println d
}

class Weekday implements Comparable {
    static final DAYS = [
        'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'
    ]
    private int index = 0

    Weekday(String day) {
        index = DAYS.indexOf(day)
    }
    
    Weekday next() {
        return new Weekday(DAYS[(index+1) % DAYS.size()]);
    }

    Weekday previous() {
        return new Weekday(DAYS[index-1])
    }

    int compareTo(Object o) {
        return this.index <=> o.index
    }

    String toString() {
        return DAYS[index]
    }
}

def mon = new Weekday('Mon')
def fri = new Weekday('Fri')

def worklog = ''
for (d in mon..fri) {
    worklog += d.toString() + ' '
}

println worklog

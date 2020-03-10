// try a thread!

class T extends Thread {
    T() {
        println "Creating T"
    }

    void run() {
        println "T is running"
    }
}

t = new T()
t.start()

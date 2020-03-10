// A person bean with standard attributes.
// The novelty is how the constructor is invoked

class PersonBean {
    def name, age, sex
    // no constructor defined

    def myDetails() {
        println "Name: $name; Age $age; Sex $sex"
    }
}

person = new PersonBean(name: 'Amol', age: 34, sex: 'M')
person.myDetails()

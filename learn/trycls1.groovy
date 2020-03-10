// classes

class Dog {
    String name

    void bark() {
        println "RUFF! RUFF!"
    }
    
    String getFullName(master) {
        name + " " + master.lname
    }
  
    void obeyMaster() { 
        println "I hear you and will not obey."
    }
}

class DogOwner {
    String fname
    String lname
    
    void trainPet(pet) {
        pet.obeyMaster()
    }
}

myDog = new Dog()
myDog.name = "Mollie"

myDog.bark()
myDog.obeyMaster() 

me = new DogOwner()
me.fname = "Ralf"
me.lname = "Waldo"

me.trainPet(myDog)

str = myDog.getFullName(me)
println str  // prints Mollie Waldo

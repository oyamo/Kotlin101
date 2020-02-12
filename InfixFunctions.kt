infix functions
class Person{
    public var name: String
    get() = field
    set(value){field = value}
    constructor(name: String){
        this.name = name
    }
   
}
fun main(args: Array<String>){
    //This infix function detects whether a programmer can love a non-Programmer
   infix fun Person.canLove(b: Person): Boolean = b.name.split(" ")[0] == "Coder"
   var brayo: Person = Person("Coder Brayoo")
   var anotherPerson: Person = Person("Julia Locust Anyango")
   println(brayo canLove anotherPerson)
   
}

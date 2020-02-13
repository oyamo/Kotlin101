//Kotlin Special Classes
//[Data classes] make it easy to create classes that are used to store values. 
//Such classes are automatically provided with methods for copying, getting a string representation, and using instances in collections.
data class Person(var name:String, var age: Int)
//[ENUM] Enum classes are used to model types that represent a finite set of distinct values, such as directions, states, modes, and so forth.
enum class State{
    RUNNING, HALTED, ABORTED
}
fun main(args: Array<String>){
    val state = State.RUNNING
    when{
        state == State.RUNNING -> println("Program Running Smoothlt")
        state == State.ABORTED -> println("Program aborted by the user")
        state == State.HALTED -> println("Program stopped unfortunately")
        else -> println("State Unkown")
    }
    
    val person1 = Person("Oyamo Brian",12)
    val person2 = Person("Mutiso Njoki",13)
    println(person1.equals(person2))
    println(person1 == person2)
    
}

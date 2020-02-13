//Inheritance
//
//A class must be 
// //    Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
//     Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
//     A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate an invocation of the superclass default constructor.
//     Overriding methods or attributes requires the override modifier.
open class Dog{
    open fun sayHello(){
        println("Whof Whoof")
    }
}
class wolf : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main(args: Array<String>){
    var myWolf: wolf = wolf()
    var myDog: Dog = wolf()
    var myDog2: Dog = Dog()
    myDog.sayHello()
    myWolf.sayHello()
    myDog2.sayHello()
}

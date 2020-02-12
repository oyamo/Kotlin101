//Object Oriented Kotlin
// You can declare a class by using one line by 
// Stating the class name and the required parameters
// Note that you mention whether the parameter is mutable or not uising var or val appropriatly
class Teacher(var name:String, var subject: String)
//Method2 of declaring a class
class Student{
    public var name: String 
    //Set the getters and setters
    	set(value){field = value}
        get() = field
    public var course: String
    	set(value){field = value}
        get() = field

    constructor(name: String, course: String){
    	this.name = name
        this.course = course
	}
    
}
fun main(args: Array<String>){
    val student:Student = Student("Oyamo","Computer Science")
    val teacher: Teacher = Teacher("John Doe","Computer Science")
    println(teacher.name)
    println(student.course)
}

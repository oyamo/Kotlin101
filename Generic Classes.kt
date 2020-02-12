/**
 * 
 * Generic classes and functions increase code reusability by encapsulating common logic that is independent of a particular  
 *  generic type, like the logic inside a List<T> is independent of what T is
 */
class Person(var name: String, var age: Int)
class MutableStack<E>(vararg items: E){
    private var current: Int = -1
    private val elements = items.toMutableList()
    public fun push(element: E) = elements.add(element)
    public fun pop(): E = elements.removeAt(elements.size - 1)
    public fun size(): Int = elements.size 
    public fun isEmpty(): Boolean = elements.isEmpty()
    public fun next(): E {
       
        when{
            current > elements.size-1 -> {throw IndexOutOfBoundsException("You have reached the last index")}
        }
         current ++
        return elements.get(current)
    }
}
fun main() {
    var people: MutableStack<Person> = MutableStack<Person>(Person("Oyamo Brian",32))
    people.push(Person("John Doe",20))
    people.push(Person("Mike Tyson",10))
    people.push(Person("Patricia Mutiso",92))
    println(people.next().name)
    println(people.pop().name)
    println(people.size())
}

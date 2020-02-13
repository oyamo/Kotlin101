////Parametised inheritance
open class Car(val name: String){
    val nam = name
    open fun vroom(){
        println("$name Vroom!!!!!!")
    }
}
class Ferari: Car("Ferari")

fun main(){
	var myFerari = Ferari()
    myFerari.vroom()
    
}

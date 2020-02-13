//Looping in Kotlin
fun main(args: Array<String>){
    //1
    //Looping n times ( from 0 to n-1) using 0..n-1
    println()
    for (i in 0..9){
        print(" 💖 ")
    }
    //2
    //Looping downWards (from n to 0)
    println()
    for (i in 9 downTo 0){
        print(" 😉 ")
    }
    println()
    //3
    //Looping n times beginning from a - z( starting point or ending point must be a char)
    for (i in 'a'..'k'){
        print(" $i ")
    }
    println()
}

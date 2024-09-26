package mykotlin/*
fun main(args : Array<String>){
    val a=6
    val b=10
    var c:Int
    if (a>b)
    {
        c=a
    }
    else
    {
        c=b
    }
    println(c)
}
*/


//ANOTHER WAY
/*
fun main(args: Array<String>) {
    val a = 6
    val b = 10
    var c: Int = if (a > b)
        a
    else
        b
    println(c)
}
*/



// WHEN TO USE BRACKET
fun main(args: Array<String>) {
    val a = 6
    val b = 10
    var c: Int = if (a > b) {
        print("a is Greater")
        a
    } else {
        print("b is Greater ")
        b
    }
    println(c)
}


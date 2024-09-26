package mykotlin/*fun main(args :Array<String>){
    var c=max(2,7)
    println("The Maximum number is $c")
}

fun max(a:Int,b:Int):Int{
    if (a>b)
        return a
    else
    return b
}*/

//FUNCTION AS EXPRESSION [IT WILL REDUCE THE CODE]

/*fun main(args :Array<String>){
    var c=max(2,7)
    println("The Maximum number is $c")
}

fun max(a:Int,b:Int):Int = if (a>b) a else b*/

//IF A & B VALUE AS STATEMENT USE A  BLOCK {}
fun main(args: Array<String>) {
    var c = max(2, 7)
    println("The Maximum number is $c")
}

fun max(a: Int, b: Int): Int = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$b is greater")
    b
    //90 //END OF THE BLOCK WILL BE RETURN o/p is The Maximum number is 90
}

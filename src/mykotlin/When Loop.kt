package mykotlin//WHEN AS A EXPRESION

//THE VALUE OF X=1 IN KOTLIN X-->1
/*
fun main(args: Array<String>) {
    val x=7
    when(x) {
        1 -> print("x is 1")
        2 -> print("x is 2")
        else ->
        {
            println("x is unknown")
            print("x is null")
        }
    }
}
*/

//USING MULTIPLE VALUS

/*fun main(args: Array<String>) {
    val x=0
    when(x) {
        0,1,2 -> print("x is 0 or 1")
        2 -> print("x is 2")
        else ->
        {
            println("x is unknown")
            print("x is null")
        }
    }
}*/

//USING IN  AND NOT AND  .. RANGE
/*
fun main(args: Array<String>) {
    val x=2
    when(x) {
        //in 1..10 -> print("x lies in 1 to10")
        //CAN ALSO USE !
        !in 1..10 -> print("x lies in 1 to10")
        2 -> print("x is 2")
        else ->
        {
            println("x is unknown")
            print("x is null")
        }
    }
}
*/

//USING STRING
/*
fun main(args: Array<String>) {
    val x = 20
    var str: String

    when (x) {
        1 -> str = "x is1"
        2 -> str= "x is 2"
        else -> {
            str=("x is unknown")
        }
    }
    println(str)
}
*/


//NOTHER WAY
/*fun main(args: Array<String>) {
    val x = 20
    var str: String= when (x) {
        1 -> "x is1"
        2 -> "x is 2"
        else -> {
           ("x is unknown")
        }
    }
    println(str)
}*/

//IN ELSE PART IF THER IS A TWO STATEMENT , WHICH ONE WILL BE PRINT?
//END STATEMENT ALWAYS BE PRINT IN OUTPUT
fun main(args: Array<String>) {
    val x = 20
    var str: String= when (x) {
        1 -> "x is1"
        2 -> "x is 2"
        else -> {
            ("x is unknown")
            ("x is an alien")
            (" I don't know the value of X")
        }
    }
    println(str)
}
//IN ABOVE EXAMPLE WHEN AS AN EXPRESSION & REURNING THE VALUE


package mykotlin

/*Closures :
* IN JAVA , CANNOT CHANGE[MUTATE] VALUES OF OUTSIDE THE VARIABLE INSIDE LAMDAS
* BUT IN KOTLIN CAN CHANGE OR MODIFY THE VALUES THE VALUES
 */

fun main(args: Array<String>) {
    val z = Programs()
    var result = 0
    z.sumOfTwoNum(2, 3) { x, y -> result = x + y } //MODIFY THE VALUES THE VALUES OF RESULT
    println(result)
}

class Programs {
    fun sumOfTwoNum(a: Int, b: Int, action: (Int, Int) -> Unit) { // HIGH LEVEL FUNCTION WITH LAMDA
        action(a, b)

    }
}
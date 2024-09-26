package mykotlin

/*IT : IMPLICT NAME OF SINGLE PARAMETER INSIDE A LAMDA EXPRESSION*/

fun main(args: Array<String>) {
    val z = Progrms()
    val lamda: (String) -> String = { it.reversed() }
    //THIS  [a -> a.reversed() ] CAN BE REPLACED WITH IT [COZ IT HAS JUST A SINGLE PARAMETER]
    z.sumOfTwoNum("Hello", lamda)
}

class Progrms {
    fun sumOfTwoNum(a: String, action: (String) -> String) { // HIGH LEVEL FUNCTION WITH LAMDA
        var result = action(a)  //it.reversed() ==> a.reversed() ===> "hello".reversed() ==>  "olleh"
        println(result)
    }
}
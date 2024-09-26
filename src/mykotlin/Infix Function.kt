/*INFIX FUNCTION CAN BE MEMBER FUNCTION OR EXTENSION FUNCTION BUT EXTENSION FUNCTION CANNOT BE INFIX FUNCTION
INFIX FUNCTION HAVE SINGLE PARAMETER
INFIX FUNCTION HAVE PREFIX OF "INFIX"*/


package mykotlin
fun main(args: Array<String>) {
    var X: Int = 30
    var Y = 4
    /*var c = X.greaterValue(Y)*/
    var c = X greaterValue Y //USAGE OF INFIX FUNCTION
    println(c)
}


infix fun Int.greaterValue(M: Int): Int { //EXTENSION FUNCTION & ALSO A INFIX FUNCTION
    //infix fun Int.greaterValue(M: Int, N: Int): Int { -> THIS CANNOT BE A INFIX FUNCTION BCOZ IT HAS TWO PARAMETER .IT WILL BE ONLY A EXTENSION FUNCTION
    if (this > M)
        return this
    else
        return M
}

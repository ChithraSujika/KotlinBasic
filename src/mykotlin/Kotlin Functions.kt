package mykotlin//SYNTAX OF FUNCTION


/*fun -> Keyowrd
findArea -> Method Name
length:Int,breadth:Int -> Formal Parameter
:Int ->Reurn Type*/

/*fun findArea(length:Int,breadth:Int): Int{
    //Method Body : Code here
    //return length*breadth
}*/


//METHOD CAN RETURN VOID
/*fun findArea(length:Int,breadth:Int): Unit{

    //print( length*breadth)
}*/

//IN JAVA WE USE VOID BUT IN KOTLIN WE USE UNIT.
//IF NOT RETURNING ANY VALUE THEN USE UNIT OR WITHOUT UNIT ALSO CODE WILL RUN [UNIT WILL INBUILD].

//=================================================================================================================================================

//FUNCTION TO ADD TWO NUMBERS in JAVA
/*fun main(args:Array<String>){
    add()
}

fun add(){
    var a=2
    var b=5
    var c= a+b
    println("The sum is "+c)
}*/

//==============================================================================================================================================

//IN KOTLIN

/*fun main(args:Array<String>){
    add()
}

fun add(){
    var a=2
    var b=5
    println("The sum is ${a+b}")
}*/

//==============================================================================================================================================

//IN PARAMETER
/*
fun main(args:Array<String>){
    add(2,3)
}

fun add(a :Int,b:Int):Unit{  //UNIT IS OPTIONAL
    println("The sum is ${a+b}")
}
*/

//EXAMPLE OF PRINT THE STATEMENT IN MAIN METHOD NOT ON FUNCTION METHOD

fun main(args: Array<String>) {

    var c = add(2, 3)
    println("The sum is $c")
}

fun add(a: Int, b: Int): Int { //IF WE DOESN'T RETURN THE VALUSE O/P WILL BE  : The sum is kotlin.Unit
    return a + b
}
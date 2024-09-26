package mykotlin

import java.lang.Integer.sum

/* HIGH LEVEL FUNCTIONS:
* CAN ACCEPT FUNCTION AS PARAMETERS
* CAN RETURN A FUNCTION
* OR CAN DO BOTH

LAMDAS:
IT IS JUST A FUNCTION WITH NO NAME
* Ex : {s-> println(s)}
* hers s is a Parameter just like Int:a ,Int:b
* println(s) it is a body of lamda expression
* Lamda Expression can also assingn to any varaible Ex: Val a={s-> println(s)}
* Can assign Data Type in Two ways  Val a={s:Int-> println(s)}  or Val a:(Int) -> Unit  ={s:Int -> println(s)} Here Unit has given coz it return nothing
* Val a:(Int) -> Int  ={s:Int -> 2+3} or Val a:(Int) -> String  ={s:Int -> "My3"}
* HIGH LEVEL FUNCTION MEANS ACCEPTING THE LAMDA FUNCTION */

/*fun main(args: Array<String>) {
    val z = Program()//OBJECT CREATION
    z.sumOfTwonum(2,3)
}

class Program {
    fun sumOfTwonum(a: Int, b: Int) {
        val add = a + b
        println(add)
    }
}*/

//CAN GET IT SAME O/P BY USING INSTREFACE

/*fun main(args: Array<String>) {
    val z = Program()
    z.sumOfTwonum(2, 3, object : MyInterface {
        //IN JAVE TO GET THE VALUES WE BE USING NEW LISTENER(ONCLICK ,DOUBLE CLICK..) BUT IN KOTLIN WE DON'T HAVE NEW KEYWORD HENCE USING OBJECT .
        override fun add(sum: Int) {
            println(sum)
        }
    })
}

class Program {
    fun sumOfTwonum(a: Int, b: Int, action: MyInterface) { //PARAMETER
        val sum = a + b
        action.add(sum) //BODY
    }
}

interface MyInterface {
    fun add(sum: Int)
}*/


//LAMDAS

/*fun main(args: Array<String>) {

    //LAMDA EXPRESSION[ it is a Function which has no name .here s acting as a parameter.println(s) this body of the method ]
    //JUST LIKE val b:String="HELLO"
    //val lamda: (Int) -> Int = { s: Int -> 2 + 3 }  //IF println(2+3) data Type is INT

    //Two ways :
    val z = Program()
    //z.sumOfTwonum(2, 3, { s: Int -> println(s) })
    //OR
    val lamda: (Int) -> Unit = { s -> println(s) }//Unit is return typr of println(s). (Int)is data type of s.
    z.sumOfTwonum(2, 3, lamda)
}

class Program {
    fun sumOfTwonum(a: Int, b: Int, action: (Int) -> Unit) { //HIGH LEVEL OF FUNCTION WITH LAMDA AS PARAMETER
        val sum = a + b
        action(sum) //println(sum)
    }
}*/


//OTHER WAY OF LAMDA : ADDING THE VALUES IN LAMDA EXPRESSION & PRINTING IN CLASS FUNCTION METHOD
// .
fun main(args: Array<String>) {
    val z = Program()
    //THREE WAYS OF LAMDA CAN BE WRITTEN
    /*val lamda:(Int,Int) -> Int={x,y -> x+y} // HERE X IS INT , Y IS INT , AND X+Y RETURN INT.
    z.sumOfTwoNum(2,3,lamda)
               OR
    z.sumOfTwoNum(2,3,{x,y -> x+y})*/
    //OR
    z.sumOfTwoNum(2, 3) { x, y -> x + y }
}

class Program {
    fun sumOfTwoNum(a: Int, b: Int, action: (Int, Int) -> Int) { // HIGH LEVEL FUNCTION WITH LAMDA
        val xyx = action(a, b) //a=2,b=3 hence a+b =2+3= 5
        println(xyx)
    }
}


/*LAMDA AND HIGH LEVEL FUNCTIONS

                                Signature:
     Variable Name        Parameters & Return   Parameters   Method Body
          |               Type of Method Body       |           |
          |                        |                |           |
*  val myLamdaFunc : (Int , Int ) -> Int =        { x,y -> x + y }
* addTwoNum( 3, 8 ,myLamdaFunc ) // PASSING LAMDA TO HIGH LEVEL FUNCTION

* fun addTwoNum(a:Int,b:Int , myFun: (Int,Int)->Int){
* var result = myFun(a,b)  //INSTAD OF ACTION IT IS A USER DEFINE HENCE BE USING myFun.
* println(result)
* */





//INTEROPERABILITY -> CAN CALL JAVA FUNCTION FROM KOTLIN AND KOTLIN FUNCTION FROM JAVA
//                 -> CAN HAVE JAV AND KOTLIN FILES WITHIN THE SAME PROJECT

//REASON : IN BOTH JAVA & KOTLIN RUNNING METHOD SAME ONLY DIFF IS SAVING CLASS NAME IN JAVA EX: Interoperabilty.java In KOTLIN :Interoperability.kt

//HOW WE SEE OUR KOTLIN FILE
//ASSUME THE FILE NAME IS INTEROPERABILITY.KT

/*
fun add(a: Int): Boolean {
    //METHOD BODHY
}
*/

//AFTER COMPILATION KT FILE CONVERTED INTO CLASS INTEROPERABILITY.CLASS
/*class Interoperabilitykt {
    public static Boolean add(int a)
    {
        //METHOD BODY
    }*/


/*
//ACESS METHOD INSIDE THE KOTLIN CLASS FROM INSIDE THE JAVA CLASS
fun main(args : Array<String>){

}

fun add1(a:Int,b:Int):Int{
    return  a+b
}*/


@file:JvmName("InterOperaBility")

package mykotlin

import myjava.MyJavaFile

//CHANGING THE FILE NAME IN CODE [OPTIONAL]

//ACESS JAVA METHOD FROM WITHIN THE KOTLIN FILE
fun main(args: Array<String>) {
    var area = MyJavaFile.getArea(3, 3)
    println(area)
}

fun add1(a: Int, b: Int): Int {
    return a + b
}



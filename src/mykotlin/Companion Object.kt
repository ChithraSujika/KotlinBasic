//COMPANION OBJECT ARE SAME AS "OBJECT" BUT DECLARED WITHIN A CLASS WITH COMPANION OBJECT KEYWORD---@JVMSTATIC AT METHOD
package mykotlin

fun main(args: Array<String>) {
    MyClass.a
    MyClass.TypeOfCustomers()
}

class MyClass {
    companion object { //SHOULD USE COMPLANION KEYWORD IF OBJECT USING INSIDE A CLASS & NO NEED TO SPECIFY ANY CLASS NAME  EX:CUSTOMERCOUNT
        var a: Int = -1             // IT STATIC VARIABLE
        fun TypeOfCustomers(): String {  //IT IS  STATIC METHOD
            return "INDIAN"
        }
    }
}



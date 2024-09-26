package mykotlin
//DATA CLASSES PROVIDES THESE MENTIONED METHODS: ["ANY" CLASSS CONTAINS FUNCTION SUCH AS:]
//equals():Boolean
//hashcode():Int
//toString():String

fun main(args: Array<String>) {
    var a = Students("Mythri", 27)
    var b = Students("Mythri", 27)
    println(a)//WITHOUT DATA KEYWORD O/P : mykotlin.Students@3b9a45b3
    //WITH DATA O/P : Students(name=Mythri, age=27)  ->BCOZ BY DEFAULT DATA CLASS PROVIDE THE DEFAULT IMPLEMENTAION OF TOSTRING() METHOD
    if (a == b) {
        println("EQUAL")
    } else {
        println("Not EQUAL")
    }

    //COPY->ESAY WAY TO OVERIDE THE PARAMETR
    var a1 = a.copy(name = "My3")
    println(a1)
}

/*class Students(var name: String,var  age: Int) {
}
OUTPUT : Not EQUAL ->Bcoz compring the object ref both are diff obj*/

data class Students(var name: String, var age: Int) { //OUTPUT : EQUAL  BCOZ DATA DEAL WITH DATA/VALUES NOT WITH OBJECT
//IN DATA CLASS PRIMARY CONSTRUCTOR SHOULD CONTAIN THE PROPERTY PARAMETER SUCH AS VAL OR VAR , IT CANNOT CONTAIN THE PARAMETER
}




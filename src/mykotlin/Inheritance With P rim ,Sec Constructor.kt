//HOW TO USE PRIMARY & SECONDARY CONSTRUCTOR WHEN WE USE INHERTIANCE
package mykotlin
//PRIMARY CONSTRUCTOR OVERRIDE
/*
fun main(args: Array<String>) {
    var z = Kids("WHITE",1)
}

open class Parents(var color: String) { //SUPER CLASS
    //var color: String = ""  IT CAN BE WRITTEN INSIDE A CLASS PARAMETER
    init {
        println("$color")
    }
}

//class Kids (var age: Int): Parents()//HERE IN PARENTS() CONSTR ERROE 'COS IN PARENT PARAAMETER HAS BENN DECLARED HENCE DECLARE ANY STRING AND PASS ANY PARAMETER NAME
class Kids (color: String,var age: Int): Parents(color) {  //SUB CLASS
    //var age: Int = -1   IT CAN BE WRITTEN INSIDE A CLASS PARAMETER
    init {
        println("$age")
    }
}
*/

//SECONDARY CONSTRUCTOR OVERRIDE
fun main(args: Array<String>) {
    var z = Kids("WHITE",1)
}

open class Parents { //SUPER CLASS
    var color: String = ""
    constructor(color: String){
        this.color=color
        println("$color")
    }
}

//class Kids (var age: Int): Parents()//HERE IN PARENTS() CONSTR ERROE 'COS IN PARENT PARAAMETER HAS BENN DECLARED HENCE DECLARE ANY STRING AND PASS ANY PARAMETER NAME
class Kids : Parents {  //SUB CLASS
    var age: Int=-1
    constructor(color: String, age: Int):super(color){
        this.age=age
        println("From Parents Color $color and kids age : $age")

    }
}

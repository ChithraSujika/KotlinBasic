package mykotlin

/*  ?. Safe Call Operator
*   !! Not-null Assertion
*   ?: Elvis
*   ?.let { . . }  Safe Call With Let */

//=============================================================================================================================================================================================

//IN KOTLIN BY DEFAULT , THE NULL VALUE IS NOT SUPPORTED BY A VARIABLE, HENCE NEED TO USE ? TO AVOID NULL POINTER EXCEPTION  //NULLABLE DATA TYPE


/*  Safe Call Operator (?.)
* RETURNS THE LENGTH IF 'NAME' IS NOT NULL ELSE RETURN NULL
* USE IT IF YOU DON'T MIND GETTING NULL VALUSE */

/*  Safe Call With Let  (?.let)
*   IT EXECUTES THE BLOCK ONLY IF NAME IS NOT NULL */

/*  Elvis-Operator(?:)
*    WHEN WE HAVE NULLABLE REFERENCE 'name' , WE CAN SAY "is name is not null",USE IT ,
*    OTHERWISE USE SOME NON-NULL VALUE [-1 MEANS  DEFAULT VALUE]*/

/*  Not-null Assertion Operator (!!)
*   USE IT WHEN YOU ARE SURE THE VALUE IS NOT NULL
*   THROWS NULLPOINTEREXCEPTION IF THE VALUE IS FOUND TO BE NULL */

//=============================================================================================================================================================================================================

//WAP TO FIND OUT LENGTH OF NAME
//VARAIBLE IS NULL
/*
fun main(args: Array<String>) {
    val name: String? = null
    println("The length of name is ${name?.length}")  //SAFE CALL 0:P IS NULL

    name?.let { //SAFE CALL WITH LET
        println("The length of name is ${name.length}") //THERE IS NO OUPUT FOR THIS OPERATOR COZ IT JUST SKIP IT IF O/P IS NULL
    }

   */
/* if (name!=null){
        println("${name.length}")
    }
    else
        -1*//*


    //OR ABOVE CODE CAN BE WRITTEN IN ONE LINE USING Elvis-Operator

    var z=name?.length?:-1 //ELVIS-OPERATOR
    println("The length of name is $z") // o:p : The length of name is -1

    //println("The length of name is ${name!!.length}")//IT SHOW ERROR NullPointerException .Use this operator only if Varible is not null.

}*/


//VARAIBLEIS NOT NULL

fun main(args: Array<String>) {
    val z: String = "Mythri"
    println("The length of the name is ${z.length}") //NO NEED TO USE "SAFE CALL" COZ ITS NOT NULL

    z.let { //NO NEED TO USE SAFE CALL IN "LET" WHEN VARIABLE Z IS NOT NULL
        println("The length of the name is ${z.length}") //O:P 6 , SAFE CALL OPERATOR GENERATE OUTPUT ONLY IF VARIABLE Z IS NOT NULL
    }

    val x = z.length ?: -1  //ELVIS-OPERATOR
    println("The length of the name is $x") //0/P:The length of the name is 6

    println("The length of the name is ${z.length}") //0/P:The length of the name is 6 .
}

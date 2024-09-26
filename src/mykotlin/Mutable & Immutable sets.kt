package mykotlin

/*Collections:
* Immutable Collections : Read Only Operations.
* Immutable List : listOf
* Immutable Map : mapOf
* Immutable Set : setOf

* Mutable Collections : Read and Write Both.
* Mutable List : ArrayList,arrayListOf,mutableListOf
* Mutable Map : HashMap,hashMapOf,mutableMapOf
* Mutable Set : mutableSetOf,hashSetOf.*/

//================================================================================================================================================================================================================================

/*SET CONTAIN UNIQUE ELEMENTS
* HASHSET ALSO CONTAIN UNIQUE ELEMENTS BUT SEQUENCE IS NOT GURANTEE IN OUTPUT*/

/*fun main(args: Array<String>) {
    var mySet = setOf<Int>(1, 3, 4, 3, 2, 5, 5, 3, 5, 7, 8)  //IMMUTABLE , READ ONLY
    println(mySet)
    //o/p:[1, 3, 4, 2, 5, 7, 8] //AS YOU CAN OBSERVE IT REMOVE DUPLICATE NUM , IT CONTAIN ONLY UNIQUE
    for (element in mySet) { //USING INDIVISUAL ELEMENT (OBJECTS)
        println(element)
    }
}*/

//MUTABLE'iop0-
fun main(args: Array<String>) {
    //var mySet = mutableSetOf<Int>(1, 3, 4, 3, 2, 5, 5, 3, 5, 7, 8)  //MUTABLE , READ AND WRITE BOTH
    //mySet.remove(4)
    //or
    var mySet = hashSetOf<Int>(1, 3, 4, 3, 2, 5,100, 5, 3, 5, 7, 8)
    mySet.add(4)

    println(mySet)
    //o/p:[1, 3, 4, 2, 5, 7, 8] //AS YOU CAN OBSERVE IT REMOVE DUPLICATE NUM , IT CONTAIN ONLY UNIQUE
    for (element in mySet) { //USING INDIVISUAL ELEMENT (OBJECTS)
        println(element)
    }
}
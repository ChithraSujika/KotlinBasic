package mykotlin

//MAP -> (KEY-VALUE) PAIR
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


//MUTABLE
/*fun main(args: Array<String>) {
    var myMap = mapOf<Int, String>(1 to "Hello", 2 to "Good") //IMMUTABLE ,FIXED SIZE ,READ ONL
    println(myMap)

    for (keys in myMap.keys) {  //USING INDIVISUAL ELEMENT (OBJECTS)
        //println("element at $keys = ${myMap[keys]}")
        println("element at $keys = ${myMap.get(keys)}")
    }
}*/

//  IMMUTABLE
fun main(args: Array<String>) { //MUTABLE ,NOT FIXED SIZE ,READ AND WRITE BOTH.
    var myMap= HashMap<Int,String>()
    //OR
    //var myMap= hashMapOf<Int,String>()
    //OR
    //var myMap= mutableMapOf<Int,String>()

    myMap.put(1,"Mythri")
    myMap.put(2,"Yashna")
    myMap.put(3,"Yashas")
    myMap.replace(1,"Yashaswini")
    myMap.put(3,"Yashwanth")
    println(myMap)

    for (keys in myMap.keys) {  //USING INDIVISUAL ELEMENT (OBJECTS)
        //println("element at $keys = ${myMap[keys]}")
        println("element at $keys = ${myMap.get(keys)}")
    }
}
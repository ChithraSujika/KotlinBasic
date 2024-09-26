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

//ELEMENTS :
// INDEX   : 0  1  2  3  4

/*fun main(args: Array<String>) {
    var listOfDevelopers = listOf<String>("Mythri", "Chithra", "Amirtha") //IMMUTABLE ,FIXED SIZE ,READ ONLY
    //listOfDevelopers[0]="Kusuma" //ERROR : BECOZ IT IS IMMUTABLE
    println(listOfDevelopers)

    for (Elements in listOfDevelopers) { //USING INDIVISUAL ELEMENT (OBJECTS)
        println(Elements)
        //println(listOfDevelopers.get(index=1))
    }
}*/

//IF NEED TO ADD EXTRA LISTOFSTRING
/*fun main(args: Array<String>) {
    var listOfDevelopers = mutableListOf<String>("Mythri", "Chithra", "Amirtha") //MUTABLE ,FIXED SIZE ,READ ONLY
                                                          //OR
    //var listOfDevelopers = arrayListOf<String>("Mythri", "Chithra", "Amirtha") //MUTABLE ,FIXED SIZE ,READ ONLY

   // var listOfDevelopers = ArrayList<String>{} //MUTABLE ,FIXED SIZE ,READ ONLY
    listOfDevelopers[2]="Kusuma"
             //OR
    listOfDevelopers.add("Jagtuthi")
    println(listOfDevelopers)

    for (Elements in listOfDevelopers) { //USING INDIVISUAL ELEMENT (OBJECTS)
        println(Elements)
        //println(listOfDevelopers.get(index=1))
    }
}*/


fun main(args: Array<String>) {
    var listOfDevelopers = ArrayList<String>() //MUTABLE ,FIXED SIZE ,READ ONLY
    listOfDevelopers.add("Mythri")//0
    listOfDevelopers.add("Chithra")//1
    listOfDevelopers.add("Amirtha")//2
    listOfDevelopers.add("Kusuma")//3
    listOfDevelopers.add("Jagtuthi")//4
    println(listOfDevelopers)

    for (Elements in listOfDevelopers) { //USING INDIVISUAL ELEMENT (OBJECTS)
        println(Elements)
        //println(listOfDevelopers.get(index=1))
    }
}



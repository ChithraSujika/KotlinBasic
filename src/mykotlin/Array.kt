/*Array means Collection of similar type of element.
Array : Mutable[Can change the element] but has fixed Size
*/


package mykotlin

fun main(args: Array<String>) {

    //ELEMENTS : 0  3  23 0  0
    // INDEX   : 0  1  2  3  4   //Boz Array always start with 0 and end with -1 [5-1=4]

    var array = Array<Int>(5) { 0 }    //MUTABLE BUT FIXED SIZE
    array[2] = 23
    array[1] = 3

    //array[8] =34 //ERROR : ArrayIndexOutOfBoundsException [COZ IN SIZE HAS MEANTION 5 & SIZE CANNOT BE CHANGE ]
    for (element in array) {  //USING INDIVISUAL ELEMENT (Objects)
        println(element)
    }

    for(Index in 0..array.size-1){
        println(array[Index])
    }
}


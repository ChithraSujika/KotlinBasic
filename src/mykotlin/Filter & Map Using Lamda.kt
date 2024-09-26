package mykotlin

/*FILTER : FILTER OUR DESIRED ELEMENTS FROM A COLLECTION
* RETURNS A LIST CONTAINING ONLY ELEMNTS MATCHING THE GIVEN [PREDICATE]*/


/*fun main(args:Array<String>){
    var num= listOf(1,3,5,19,22)
    var smallnumbers=num.filter { x->x<10 } //OR it<10 COZ IT HAS ONLY SINGLEPARAMTER
    for (number in smallnumbers)
    println(number)
}*/

/*MAP : PERFORM OPERATIONS,MODIGY ELEMENTS
* RETURNS A LIST CONTAINING THE RESULT OF APPLYING THE GIVEN [TRANSFORM] FUNCTION TO EACH ELEMENT IN THE ORIGINAL COLLECTION.*/

/*fun main(args:Array<String>){
    var num= listOf(1,3,5,19,22)
    var squarenumbers=num.map { x->x*x } //OR it*it COZ IT HAS ONLY SINGLEPARAMTER
    for (number in squarenumbers)
        println(number)
}*/

//USING BOTH MAP & FILTER
/*fun main(args:Array<String>){
    var number= listOf(2,3,7,8,12,13,47)
    //var squarenumber=number.filter { z->z<20 }.map { y->y*y }
    //OR
    var squarenumber=number.filter { it<20 }.map { it*it}
    for (num in squarenumber){
        println(num)
    }
}*/



fun main(args: Array<String>) {
    var persons = listOf<People1>(People1(10, "Shreyas"), People1(22, "Sumuk"), People1(23, "Mythri"))
    var onlyName = persons.filter { it.name.startsWith("S") }.map { it.name }
    /*var ages=persons.filter { it.age<20 }.map { it.age }
    println(ages)*/
    for (listOfName in onlyName)
        println(listOfName)
}

class People1(var age: Int, var name: String) {

}

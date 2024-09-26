package mykotlin

fun main(args : Array<String>){
    var a=1..5 //ASCENDING ORDER
    //THIS RANGES CONATIN THE NUMBER 1,2,3,4,5

    var b=5 downTo 1
    //THIS RANGE CONATIN 5,4,3,2,1



    val c=5 downTo 1 step 3 //STEP MEANS SKIP THE NUMBER
    println(c)
    //THIS RANGE CONATAIN 5,2

    val d='a'..'z'
    //THIS RANGE CONATIN a,b,c,d,e,f,g..z

    val e="a".."z"
    //THIS RANGE CONATIN a,b,c,d,e,f,g..z

    val isnumber= 'c' in d // TRUE

    val moveup= 1.rangeTo(10) // another method of 1..10
    val countdown= 10.downTo(1) // another method of 10..1
}
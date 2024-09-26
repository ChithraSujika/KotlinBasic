package mykotlin

/*Predicates:Or a condition that returns TRUE OR FALSE
* "all"    : Do all elements satisfy the predicate/condition?
* "any"    : Do any elements in list satisfy the predicate?
* "count"  : Total elements that satisfy the predicate
* "find"   : Returns the First element that satisfy predicate */

//==========================================================================================================================================================================================


/*fun main(args:Array<String>){
    val num= listOf(2,4,7,22,56,89)
    //var checkall=num.all { it>10 } //ARE ALL ELEMENTS GREATER THAN 10?
    //OR
    var checkall=num.all {num->num>10 }
    println(checkall)//FALSE

    //var checkany=num.any { it>10 }//DOES ANY OF THESE ELEMENTS SATISFY THE PREDCATE
    //OR
    var checkany=num.any {x->x>10 }
    println(checkany)//TRUE


    //var checkTotalCount=num.count { it>10 }//NUMBER OF ELEMENTS THAT SATISFY THE PREDICATE
    //OR
    var checkTotalCount=num.count {y->y>10 }
    println(checkTotalCount)//3  [22,56,89]


    //var find=num.find { it>10 }//RETURNS THE FIRST NUMBER THAT MATCHES THE PREDICATE
    //OR
    var find=num.find {z->z>10 }
    println(find)// 22 [First element in >10]
}*/


//INSTEAD OF USING IT>10 EVERY WHERE
fun main(args: Array<String>) {

    val num = listOf(2, 4, 7, 22, 56, 89)

    val myPredicate = { num: Int -> num > 10 }

    var checkall = num.all(myPredicate) //ARE ALL ELEMENTS GREATER THAN 10?
    println(checkall)//FALSE

    var checkany = num.any(myPredicate)//DOES ANY OF THESE ELEMENTS SATISFY THE PREDCATE
    println(checkany)//TRUE

    var checkTotalCount = num.count(myPredicate)//NUMBER OF ELEMENTS THAT SATISFY THE PREDICATE
    println(checkTotalCount)//3  [22,56,89]

    var find = num.find(myPredicate)//RETURNS THE FIRST NUMBER THAT MATCHES THE PREDICATE
    println(find)// 22 [First element in >10]
}

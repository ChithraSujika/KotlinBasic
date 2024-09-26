/*SCOPE FUNCTION MAKE A CODE CLEAR,CONCISE AND READABLE
* with
* let
* run
* also
* apply*/


/* HOW TO DISTINGUISH BETWEEN SCOPE FUNCTIONS?
*  1> THE WAY TO REFER TO THE CONTEXT OBJECT
*  Either 'this' or 'it'
*  2>  THE RETURN VALUE
*  Either 'context object' or the 'lambda result'*/




/* SCOPE FUNCTION : 'APPLY'
*  PROPERTY 1: REFER TO CONTEXT OBJECT BY USING 'this
*  PROPERTY 2: THE RETURN VALUE IS THE 'context object' */

/*fun main(args:Array<String>){
    var z=Person().apply {
        name="Mythri"
        age=26
        println("Nameof the person is $name")
        println("Age of the person is $age")
    }
}
class Person{
    var name=""
    var age=-1
}*/




/* SCOPE FUNCTION : 'WITH'
*  PROPERTY 1 : REFER TO CONTEXT OBJECT BY USING 'this'
*  PROPERTY 2 : THE RETURN VALUE IS THE 'lamda result' */

/*
fun main(args:Array<String>){
    var z=Person()
    val ageafterFiveYear:Int= with(z){
        println(this.name)
        println(age)
        age+5
    }
    println(ageafterFiveYear)
}
class Person{
    var name="Mythri"
    var age=26
}*/




/* SCOPE FUNCTION : 'also'
*  PROPERTY 1 : REFER TO CONTEXT OBJECT BY USING 'it'
*  PROPERTY 2 : THE RETURN VALUE IS THE 'context object' */


/*fun main(args:Array<String>){

    var numberList= mutableListOf(1,2,4)
   val duplicateNumbers=numberList.also {
       println("The list elements are $it")
       it.add(3)
       println("The list elements after adding an element : $it")
       it.remove(3)
       println("The list elements after removing an element : $it")
   }
    println("Original number : $numberList")
    println("Duplicate Number : $duplicateNumbers")
}*/


//USING ALL 3 SCOPE FUNCTION IN ONE CODE

/*fun main() {
    var z = Person().apply {
       name="Mythri"
        age=26
    }
    with(z){
        println(this.name)
        println(age)
    }
    z.also {
        it.name="Yashaswini"
        it.age=27
        println(it.name)
        println(it.age)
    }
}

class Person {
    var name = ""
    var age = -1
}*/




/* SCOPE FUNCTION : 'let'
*  PROPERTY 1 : REFER TO CONTEXT OBJECT BY USING 'it'
*  PROPERTY 2 : THE RETURN VALUE IS THE 'lamda result+'

*  Use 'let' function to avoid NullPointerException*/

/*fun main(args:Array<String>){
    val name:String?=null
    val stringLength=name?.let {// To avoid NullPointerException output is empty.
        println(it!!.capitalize())
        println(it!!.length)
        println(it!!.reversed())
        it.length
    }
    println(stringLength) //TO CHECK O/P CHNGE NULL TO "HELLO"
}*/





/* SCOPE FUNCTION : 'run'
*  PROPERTY 1 : REFER TO CONTEXT OBJECT BY USING 'this'
*  PROPERTY 2 : THE RETURN VALUE IS THE 'lamda result'
*  'run' is combination of 'with' and 'let'
*   if you want to operate on a Nullable object and avoid 'nullPointerExceptio' then use 'run'

*  Using 'run' function you can leverage the power of both 'with' and 'let' function.
*/

fun main(){
   val z:person?=null
    val ageafterFiveYear=z?.run {
        println(name)
        println(age)
        age+5
    }
    println(ageafterFiveYear)//To check output change it to null to person()
}

class person{
    var name="Mythri"
    var age=26
}




/*  IMP NOTE :
*   with : if you want to operate on a non-null object
*   let  : if you want to just execute lamda expression on a nullable object and avoid NullPointerExcxeptio
*   run  : if you want to operate on a nullable object,execute lamda expression and avoid NullPointerExceptio
*   apply: if you want to initialize or congigure an object
*   also : if you want to do some additional object congiguration or operations.*/











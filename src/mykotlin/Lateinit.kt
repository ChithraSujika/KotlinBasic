package mykotlin

/* lateinit:
*  USE IT WITH MUTABLE VARAIBLE [var]
*  lateinit var name:String    //Allowed
*  lateinit val name:String    //Not Allowed


*  Allowed with Only non-nullable data types
*  lateinit var name:String    //Allowed
*  lateinit var name:String?   //Not Allowed

* IT IS A PROMISE TO COMPILER THAT THE VALUE WILL BE INITIALIZED IN FUTURE

 * NOTE : IF YOU TRY TO ACCESS LATEINIT VARAIBLE WITHOUT INITIALIZING IT THEN IT THROWS UNINITALIEDPROPERTYACESSEXCEPTION.
* */

//UninitializedPropertyAccessException
/*fun main(args: Array<String>) {

    val z = pp()
    println(z.a)
}

class pp {
    lateinit var a: String
}*/



//USING PARAMETER
/*fun main(args: Array<String>) {
    val country = lateinitialization()
    country.setup("Delhi")
}

class lateinitialization {
    lateinit var z: String
    fun setup(a: String) {
        println(a)
    }
}*/


fun main(args:Array<String>){

   val country=lateinitialization()
   country.setUp()
}
class lateinitialization{
    lateinit var a:String
    fun setUp(){
        a="USA"
        println("The naem of the country is $a")
    }
}




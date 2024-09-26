package mykotlin

/*class Customer{
*  CLASS BODY
* }*/

//DEFINING THE PRIMARYCONSTRUCTOR IN KOTLIN

/*class Customer(name : String) { //PRIMARY CONSTUCTOR //IN KOTLIN CONSTUCTOR DOESN'T CONTAIN ANY BODY //PRIMARY CONSTUCTOR CONTAIN BOTH VAL /VAR
}*/



//INITIALIZE ALL THE FIELD VARIABLE IN KOTLIN
//FOR THESE IN KOTLIN HAVE INIT BLOCK
/*class Customer(name: String) {
    init {
    }
}*/



// IF NEED TO PRINT INSIDE A MAIN METHOD , PASSING THE NAME WITHOUT CONTRUCTOR PARARMETER BUT OBJECT CREATION SHOULD
/*fun main(){
    var X=Customer()//TOINTIATE THE CLASS NEED AN OBJECT
    X.name="Mythri A S"
    println("The name is ${X.name}")
}

class Customer{
    var name:String ="Mythri"// PROPERTY
}*/




//IF NEED TO PRINT INSIDE A CLASS BODY , PASSING THE NAME WITH CONTRUCTOR PARARMETER
fun main(args: Array<String>){
    var X=Customer("Mythri A S")//TO INTIATE THE CLASS NEED AN OBJECT
}

class Customer (var name:String){  //PARAMETER //USING CONSTRUCTOR IS AN OPTIONAL IN KOTLIN EX:class Customer constructor(name:String){}
    //println("The name is $name") //IN ONE WORD , IF WE NEED THE VALUE FROM CLASS TO MAIN FUN "CREATE OBJECT" ,NEED THE VALUE FROM  MAIN FUN TO CLASS USE INIT BLOCK . IF INIT BLOCK NOT USE ERROR
    init {
        println("The name is $name")
    }
}


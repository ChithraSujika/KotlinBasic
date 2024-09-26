package mykotlin

//REDEFINING OR MODYFYING THE METHOD INSIDE THE DERVIED OR CHILD CLASS

/*
fun main(args: Array<String>) {
    var x = Dogs()//OBJECT CREATION
    x.eats()

    var y = Cats()//OBJECT CREATION
    y.eats()

    var z=Animals()
    z.eats()
}

open class Animals {
    //CREATE ONE CLASS & TAKE ALL REPEATED THINGS //class Animal -> it will display ERROR B'COZ BY DEFAULT IT BE FINAL & PUBLIC HENCE USED "OPEN" KEYWORD
    var color: String = ""
    open fun eats() {
        println("ANIMAL EATING")
    }
}

class Dogs : Animals() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }
    //OVERIDE
    override fun eats(){
        println("DOG is EATING")
    }
}

class Cats : Animals() {
    var age: Int =-1
    fun meow() {
        println("MEOW")
    }
    //OVERIDE
    override fun eats(){
        println("CAT is EATING")
    }
}*/


//USING SUPER KEYWORD

/*
fun main(args: Array<String>) {
    var x = Dogs()//OBJECT CREATION
    x.eats()
}

open class Animals {
    //CREATE ONE CLASS & TAKE ALL REPEATED THINGS //class Animal -> it will display ERROR B'COZ BY DEFAULT IT BE FINAL & PUBLIC HENCE USED "OPEN" KEYWORD
    var color: String = ""
    open fun eats() {
        println("ANIMAL EATING")
    }
}

class Dogs : Animals() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }
    //OVERIDE
    override fun eats(){
        super.eats()
        println("DOG is EATING")
    }
}

class Cats : Animals() {
    var age: Int =-1
    fun meow() {
        println("MEOW")
    }
    //OVERIDE
    override fun eats(){
        println("CAT is EATING")
    }
}
*/



//STEPS OVERIDE THE VARAIBLE
//1>FIRST NEED TO CREATE AN OBEJECT OF THAT FUNCTION VARIABLE IN MAIN METHOD
//2>PRINT THE MODIFIED VARAIBLE IN MAIN METHOD
//3>IN A SUPER CLASS(ANIMAL) CREATE A VAR ,DON'T FORGET TO USE OPEN KEYWORD IF NOT IT WON'T BE OVERIDE COZ IN DEFAULLT IT BE FINAL
//4>IN A SUB CLASS OVERIDE IT USING "OVERIDE" KEYOWRD

fun main(args: Array<String>) {
    var x = Dogs()//OBJECT CREATION
    println(x.color)
    var y = Cats()
    println(y.age)
}

open class Animals {
    //CREATE ONE CLASS & TAKE ALL REPEATED THINGS //class Animal -> it will display ERROR B'COZ BY DEFAULT IT BE FINAL & PUBLIC HENCE USED "OPEN" KEYWORD
    open var color: String = "WHITE"//HERE ONLY CAN OVERIDE , IT CONSIDER AS DEFAULT
    open var age: Int = 6
    open fun eats() {
        println("ANIMAL EATING")
    }
}

class Dogs : Animals() {
    var breed: String = ""
    override var color: String = "BLACK"//VARIABLE ARE OVERRIDEN WITH OVERIDE KEYOWRD & SHOULD ADD OPEN IN SUPER CLASS
    fun bark() {
        println("Bark")
    }

    //OVERIDE
    override fun eats() {
        super.eats()
        println("DOG is EATING")
    }
}

class Cats : Animals() {

    override var age: Int = 2
    fun meow() {
        println("MEOW")
    }

    //OVERIDE
    override fun eats() {
        println("CAT is EATING")
    }
}


//IMP:
// IN ORDER TO INHERIT FROM CLASS USE THE KEYWORD "OPEN"
// IN ORDER TO OVERIDE THE PROPERTY USE THE KEYWORD "OPEN"
//IF OVERIDING SOMETHING USE THE KEYWORD "OVERIDE "
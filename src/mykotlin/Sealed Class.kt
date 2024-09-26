package mykotlin

//SEALED CLASS : THE ANOTHER WORD OF SEALED IS RESTRICTIONS
//SEALED CLASS COMES IN BETWEEN [CLASS > SEALED CLASS > ENUM CLASS]
//IN SEALED CLASS CAN CREATE THE SUB CLASSES.
//SUB CLASSES SHOULBE DEFINE WITHIN THE SAME FILE WHERE THE SEALED CLASS ISITSELF DEFINED.
//IN SEALED CLASS CAN HAAVE REGULAR CLASS & DATA CLASS TOO
//IN SEALED CLASS CAN HAAVE OBJECT DECLARATION
//WITHIN SEALED CAN DEFINE ANOTHER ONE SEALED CLASS
//IN SEALED CLASS CAN HAVE INTEFACE

sealed class Area {
    class Circle(var radius: Float) : Area()

    //class Circle1(var radius: Float=1.11F) : Area()//CAN CHANGE THE VALUE ANYWHERE IN SEALED CLASS BUT CANNOT TAKE THE VALUE OUTSIE THE FILE HENCE IT IS RESTRICTED
    class Square(var side: Int) : Area()
    class Rectangle(var length: Int, var bredth: Int) : Area()


    /*object NotShape:Shape()
        sealed class line:Shape()
        sealed interface Draw*/
    object Noshape : Area()//OBJECT DECLARAITION INHERIT FROM SEALED CLSS
}

fun main() {
    val circle = Area.Circle(2.2f)
    val rec = Area.Rectangle(2, 4)
    val square = Area.Square(3)
    val noshape = Area.Noshape
    calculate(noshape)//TO CHECK OTHER OUTPUT CHANGE IT CIRCLE /REC..

}

fun calculate(shape: Area) {
    when (shape) {
        is Area.Circle -> println("${3.14 * shape.radius * shape.radius}")
        is Area.Rectangle -> println("${shape.length * shape.bredth}")
        is Area.Square -> println("${shape.side * shape.side}")
        Area.Noshape -> println("no  shape found")
    }
}

/*IMP NOTE
* THE SUBCLASSES OF SEALED CLASSES MUST BE DECLARED IN THE SAME FILE IN WHICH SEALED CLASS ITSELF IS DECLARED.
* THE SUBCLASSES CAN BE DATA CLASS,REGULAR CLASS,OBJECT CLASS,OR EVEN ANOTHER SEALED CLASS OR EVEN SEALED INTERFACE
* SEALED CLASS ENSURE TYPE_sAFETY BY RESTRICTING THE SET OF TYPES AT COMPLIE TIME ONLY.
* A SEALED CLASS IS IMPLICITLY AN ABSTRACT CLASS WHICH CANNOT BE INSTANTAITED
* BY DEFAULT , THE CONSTRUCTOR OF A SEALED CLASS IS PRIVATE AND WE CANNOT MAKE IT AS NON-PRIVATE.*/
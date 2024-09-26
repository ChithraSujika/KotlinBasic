/*PURPOSE OF EXTENSION FUNCTION
* ADD NEW FUNCTION TO THE CLASSES
* Can "ADD" FUNCTIONS TO A CLASS WITHOUT DECLARING IT
* THE NEW FUNCTIONS ADDED BEHVAES LIKE STATIC
* */

package mykotlin

/*fun main(args: Array<String>) {
    var C = Student()//OBJECTCREATION
    println("Pass Status:" + C.hasPassed(55))
    println("Scholar Status:" + C.isscholar(82))
}

//EXTENSION FUNCTION
fun Student.isscholar(marks: Int): Boolean { //CLASSNAME.FUNCTIONNAME
    return marks > 95
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}*/

//EXTENSION FUNCTION USING INBULIT CLASS KEYWORD STRING
/*fun main(args: Array<String>) {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hey"
    println(str3.add(str1, str2))

}

//EXTENSION FUNCTION
fun String.add(s1: String, s2: String): String { //CLASSNAME.FUNCTIONNAME
    return this + s1 + s2
}*/

//FIND THE RETURN NUMBER WITH THE HELP OF INTEGER CLASS
fun main(args: Array<String>) {
    var X: Int = 30
    var Y = 4
    var c = X.graterValue(Y)//MEANS IN OUTPUT IT WILL DISPLAY THE HIGHER NUMBER
    println(c)
}

//EXTENSION FUNCTION
 fun Int.graterValue(M: Int): Int {
    if (this > M)
        return this
    else
        return M
}

/*ADAVNATGE OF EXTENSION FUNCTION
* THEY CAN PART OF YOUR OWN CLASS EXAMPLE: STUDENT , EMPLOYEE ETC..
* THEY CAN PART OF PREDEFINED CLASS EXAMPLE : STRING , INT ARRAY
* */

/*BENIFITS
* REDUCES OCDE
* CODE IS MUCH CLEANER & EASY TO READ
 */








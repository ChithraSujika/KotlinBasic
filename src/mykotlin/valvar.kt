package mykotlin

//Main Method
/*Let's start
Mutable & Imutable
 */
fun main(args: Array<String>) {
    println("Hello World")

    var a = 10   // a=INT
    var b = 2.80 // b=DECIMAL
    var c: String
    c = "I see you Yesterday"
    c = "I saw you yesterday"// [MUTABLE]
    println(a)
    println(b)
    println(c)
    //IN KOTLIN NO NEED TO DEFINE THE DATA TYPE [INBULIT]
    val d: String
    d = "i met an accident in same sport one year ago" // Constant can't be replacable the SENTENCE [IMMUTABLE]
    //d=" one year ago ,i was met an accident in same sport"
    println(d)
}
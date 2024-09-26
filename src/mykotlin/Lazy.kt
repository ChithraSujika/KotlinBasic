package mykotlin

/* LAZY:
*  'lazy initialization' was designed to prevent unnecessary initialization of objects.
*   Your variables will not be initialized unless you use it in your code
*   it is initialized only once .Next time when you use it,you get the value from cache memory.

*   it is thread safe
*   it is initialized in the thread where it is used for the first time.
*    Other Threads use the same value stored in the cache
*    The variable can be var or val
*    The variable can be nullable or non-nullable.*/

val pi: Float by lazy {
    3.14f
}//Waste of Memmory
fun main(args: Array<String>) {
    val area1= pi *4*4
    //val area2= pi&4*4 //it is initialized only once .Next time when you use it,you get the value from cache memory.
    print("The area of pi is $area1")
}

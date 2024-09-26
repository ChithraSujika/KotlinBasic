package mykotlin/* SYNTAX OF DO WHILE LOOP
* INTIALIZE COUNTER
* do{
* put code here
* INCREMENT OR DECREMENT COUNTER
* }while(condition)
*/
//FLOW FOR THE DO WHILE LOOP
//EXAMPLE
/* var i = 0
    //OR var i:Int=1
do {
        println("HELLO)
    i++
} while (i <= 3)*/

//                INTIALIZER ->   CODE EXECUTE  -> INCREMENT   -> CONDITION CHECK
// LOOP1         -> i=0          Print "HELLO" ->  i++ -> i=1  ->     1<3 -> TRUE   OUTPUT ; HELLO
// LOOP2         -> i=1          Print "HELLO" ->  i++ -> i=2  ->     2<3 -> TRUE   OUTPUT ; HELLO
// LOOP3         -> i=2          Print "HELLO" ->  i++ -> i=3  ->     3<3 -> FALSE   OUTPUT ; HELLO
//END OF LOOP    -> i=3 -> FALSE  -> LOOPTERMINATES

fun main(args: Array<String>) {
    var i = 1
    //OR var i:Int=1
    do {
        if (i%2==0)
        println(i)
        i++
    } while (i <= 10)
}
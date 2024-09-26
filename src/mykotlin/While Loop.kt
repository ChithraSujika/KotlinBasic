package mykotlin/* WHILE SYNTAX
* INTIALIZE COUNTER
* while(condition){
* put code here
* INCREMENT OR DECREMENT COUNTER
}*/

//IF WE DIDN'T ASSIGN A CURLEY BRACKET OR DIDN'T ASSIGN INC/DEC , LOOP WILL START TO INFININITY.

//FLOW FOR THE WHILE LOOP // EX :  var i=0 while (i<3){println("HELLO") i++ }
//                INTIALIZER -> CONDITION CHECK -> CODE EXECUTE  -> INCREMENT
// LOOP1         -> i=0      ->  YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=1    OUTPUT ; HELLO
// LOOP2         -> i=1       ->  YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=2    OUTPUT ; HELLO
// LOOP3         -> i=2      ->   YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=3    OUTPUT ; HELLO
//END OF LOOP    -> i=3       ->  NO   -> FALSE  -> LOOPTERMINATES

fun main(args : Array<String>) {
    var i=2
    //OR var Int:i=2
while (i<=10) {
    if (i%2==0)
    println(i)
    i++
}
}

package mykotlin//FOR LOOP SYNTAX
// for(intializer in ranges)
//{
//}

//FLOW FOR THE FOR LOOP // EX : for (i in 1..5){println("HELLO")}
//                INTIALIZER -> CONDITION CHECK -> CODE EXECUTE  -> INCREMENT
// LOOP1         -> i=1      ->  YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=2  OUTPUT ; HELLO
// LOOP2         -> i=2      ->  YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=3  OUTPUT ; HELLO
// LOOP3         -> i=3      ->  YES  -> TRUE   ->  Print "HELLO" ->  i++    -> i=4  OUTPUT ; HELLO
//END OF LOOP    -> i=4      ->  NO   -> FALSE  -> LOOPTERMINATES


fun main(args : Array<String>){
    for(i in 1 ..10){
        if (i%2==0)
        println(i)
    }
}
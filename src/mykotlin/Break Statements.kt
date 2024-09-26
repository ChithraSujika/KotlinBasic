package mykotlin/*fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
        if (i == 5)
            break
    }
}*/

//USING BREAK STATEMENT INNER FOR LOOP
/*fun main(args: Array<String>) {
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break
        }
    }
}*///HERE IN THE O/P : 2 3 DOESN'T PRINT B'COZ IN CONDITION WE BREAK THAT LINE
/*  0UTPUT :
   1 1
   1 2
   1 3
   2 1
   2 2
   3 1
   3 2
   3 3*/



//LABELED FOR LOOP [WE CAN MENTION THE LINE , IN WHICH LINE NEED TO BREAK THE STATEMENT]
//HERE IN EXAMPLE , I HAD MENTION ONLY OUTER FOR LOOP NEED TO BREAK THE STATEMENT , NOT AN INNER FOR LOOP. HENCE I WILL STOP EXECUTE AFTER 2 2 IS MATCH

fun main(args: Array<String>) {
    myoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break@myoop
        }
    }
}

/*
OUTPUT:
1 1
1 2
1 3
2 1
2 2*/

package mykotlin/*fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
}*/

/*OUTPUT :
1
2
3
4
6
7
8
9
10*/

//PRINT ODD NUMBER IN CONTINUE STATEMENT

/*
fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i%2==0) {
            continue//IN ANOTHER WORK SKIP IT
        }
        println(i)
    }
}*/


//NESTED FOR LOOP USING CONTINUE

/*fun main(args: Array<String>) {
    for (i in 1..3) {
        for (j in 1..3) {
            if (i==2 && j==2) {
                continue//IN ANOTHER WORK SKIP IT
            }
            println("$i $j")
        }
    }
}*/

/*OUTPUT:
1 1
1 2
1 3
2 1//2 2  HAS BEEN SKIPPED
2 3
3 1
3 2
3 3
 */

//LABELE IS AN USER DEFINR , WE CAN DEFINE IT AS MYLOOP /OUTERLOOP/OUTER...
//LABELED FOR LOOP [ TO SKIP THE VALUE AFTER CONTINUE VALUE SKIPPED]


fun main(args: Array<String>) {
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@outer //OUTER LABEL [HERE OUTER LABEL TELLING TO CONTNUE USE THE PROPERTY FOR OUTER FOR LOOP]
                //THIS STATEMENT IS APPLICABLE FOR NEAREST FOR LOOP
                //HENCE IN O/P IT BE SKIP 2 2 AND ALOSE 2 3.
            }
            println("$i $j")
        }
    }
}

/*
OUTPUT :

1 1
1 2
1 3
2 1
3 1
3 2
3 3*/

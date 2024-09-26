/*TAILREC FUNCTION [RECURSIVE FUNCTION]
* THIS FUNCTION USES RECURSION IN OPTIMISED WAY
* RECURSION : IT MEANS CALLING ITS OWN FUNCTION FROM WITHIN THE FUNCTION
* IT PREVENT STACK OVER FLOW EXCEPTION PREFIX OF "TAILREC" IS USED*/


package mykotlin

import java.math.BigInteger

fun main(args: Array<String>) {
    //0,1,1,2,3,5,8,13..... [0+1 = 1 , 1+1 =2 ,2+1= 3, 3+2 =5 , 5+3 =8 , ...... for 100 o/pbe 354224848179261915075 but 1000  IT WILL SHOW StackOverflowError
    println(getfibono(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getfibono(
    n: Int,
    a: BigInteger,
    b: BigInteger
): BigInteger {//tailrec cause to stop the Stackoverflow out of bound exception
    if (n == 0)
        return b
    else
        return getfibono(n - 1, a + b, a)
}




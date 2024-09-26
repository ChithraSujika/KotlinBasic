//NAMED PARAMETER IS A PURE KOTLIN FEATURE NOT PRESENT IN JAVA.HENCE , NO CHANCE OF INTEROPERABIITY
//ADVANTAGE:
//IF HAVE 7 TO 8 PARAMETER ,IT WILL GIVE A SAFER SIDE OF DEFINING THE ACTUAL ARGUMENT IN THE MAIN METHOD .HENCE , IT WILL HELP TO AVOID THE MISTAKE WHILE DEFINING THE VALUE
package mykotlin

fun main() {
    Volume(length = 10, Breadth = 20)
    //IF POSITION CHANGE ALSO AS MENTION IN FUNCTION PARAMETER POSITION WILL FALLOW UP!//Volume(Breadth = 20 ,length = 10 )
}

fun Volume(length: Int, Breadth: Int, Height: Int = 10) {
    println("length is " + length)
    println("Breadth is " + Breadth)
    println("Height is " + Height)
}


//DEFAULT ARGUMENTS :FUNCIONS
package mykotlin

fun main(args : Array<String>){
    var TotalLength= findVolume(3,2,)
    println(TotalLength)

}
@JvmOverloads
fun  findVolume(length : Int , breadth: Int , Height :Int=10 ) : Int{
    return length*breadth*Height
}

//HERE in O/p 60 [3*2*10] ,BY DEFAULT IT WILL TAKE THE VALUEOF 10
//IF WE GIVE
// var TotalLength= findVolume(3,2,8),HERE OVERIDES  THE DEFAULT VALUE , IT WILL BE OVERIDE & O/P 48









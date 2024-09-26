//Backing Property is PUBLIC
//Backing Property : Exposed to outside world.


/*
class Human{
    var age:Int=0 //By default it is public  hence Original property exposed outside.Anyone can modify it.
}
*/

//ALTERNATE SAFE CODE USING BACKING PROPERTY
/*fun main(args: Array<String>) {
    val z = Human()
    z.age = 45
    println("The age is ${z.age}")
}

class Human {
    private var _age: Int = 0   // backing field: holds actual 'age' property data
    var age: Int          // backing property : exposed to outside world
        get() {
            return _age
        }
        set(value) {
            _age = value
        }
}*/

/*Imp Note :
*  within class Human always use _age field to acess the property
*  But outside class Human , use age to acess the property*/

//IN THIS EXAMPLE CAN REMOVE THE DATA EASILY

/*fun main(){
    val x=Student()
    x.addHobby("Cricket")
    x.z.remove("cricket") //ACCIDENTAL DELETION OF DATA:WE DON'T WANT THIS
}

class Student{
    val z= mutableListOf<String>()//MUTABLE
    fun addHobby(a:String){
        z.add(a)
    }
}*/

//SECURE THE DATA USING BACKING PROPERTY

fun main(){
    val x=Kids()
    x.addHobby("STUDY")

    //x.z.remove("STUDY") //ERROR : CODE WON'T COMPILE IT IS SECURE.
   //ACCIDENTAL DELETION OF DATA:WE DON'T WANT THIS
}

class Kids {
    private val _z = mutableListOf<String>()//BACKING FIELD
    val z: List<String>
        get() = _z

    fun addHobby(a: String) {
        _z.add(a)
    }
}




//Alternate safe code using Backing Property



package mykotlin

/*SYNTAX OF ENUM:
enum class classname*/

//USE OF ENUM : TO STORE SAME TYPE OF COSNTANT VALUES

/*enum class CreditCardType { //ENUM SYNTAX
    SILVER,        //-->THESE THREE ARE ENUM CONSTANTS                                          //0  //oridinal=0   //name="SILVER"
    GOLD,          //THESE 3 object ARE BY DEFALUT ITS IN SEUENCE & ASSIGN INDEX VALUE          //1  //oridinal=1   //name="GOLD"
    PLATINUM       //THESE INDEX CAN BE ACCESS BY USING PREDEFINE PROPERTY KNOWN AS ORIDINAL    // 2  //oridinal=2  //name="PLATINUM"
    //ANOTHER ONE DEFAULT PROPERTY NAME
}

fun main() {
    var myCardType: CreditCardType = CreditCardType.GOLD //ENUM CONSTANTS ARE OBJECTS OF ENUM CLASS TYPE
    *//*EACH ENUM OBEJECT HAS TWO PROPERTIES : ORIDINAL AND NAME*//*
    println(CreditCardType.GOLD.ordinal)  //O:P  : 1
    println(CreditCardType.GOLD.name)     //0:P  : "GOLD"
    println(CreditCardType.GOLD)//INTENRNALLY EXECUTE toString Method
    *//*EACH ENUM OBJECT HAS TWO METHOD : values() & valueOf()*//*
    //values() : ALL THE ENUM FUNCTION RETURN IN THE FORM OF ARRAY
    val myConstants = CreditCardType.values()
    myConstants.forEach { println(it) } //CAN USE THIS ARRAY TO PRINT ALL THE VALUE IN LOOP
    *//*MOST COMMON USAGE OF ENUM IS WITHIN WHEN STATEMENT*//*
    when (myCardType) {
        CreditCardType.SILVER -> println("SILVER")
        CreditCardType.GOLD -> println("GOLD")
        CreditCardType.PLATINUM -> println("PLATINUM")
    }
}*/


//USING CONSTRUCTOR IN ENUM CLASS
/*enum class CreditCardType(val color: String, val maxlimit:Int=1000000) {
    SILVER("BLACK", 2),                                                 //oridinal=0   name="SILVER"
    GOLD("GREEN" ), // CAN ALSOE GIVE CONSTANT VALUE IN CONSTR ITSELF           //oridinal=1   name="GOLD"
    PLATINUM("BROWN", 4)                                                //oridinal=2  name="PLATINUM"
}

//IF NEED TO ADD MORE PROPERTY TO EACH ENUM OBJECT FOR THAT CAN USE "ENUM CLASS CONSTRUCTOR"
fun main() {
println(CreditCardType.GOLD.maxlimit)//GREEN
}*/




//CAN USE INTERFACE IN A ENUM CLASSES
interface iCreditCardType {
    fun getValues(): Float
}

enum class CreditCardType(val color: String, val maxlimit: Int = 1000000) : iCreditCardType {
    SILVER("BLACK", 2) {
        override fun getValues(): Float {
            return 0.02f
        }
    },
    GOLD("GREEN") {
        override fun getValues(): Float = 0.05f //CAN ALSO WRITE AS AN EXPRESSION
    },
    PLATINUM("BROWN", 4) {
        override fun getValues(): Float {
            return 0.06f
        }
    }
}

//IF NEED TO ADD MORE PROPERTY TO EACH ENUM OBJECT FOR THAT CAN USE "ENUM CLASS CONSTRUCTOR"
fun main() {
    println(CreditCardType.GOLD.maxlimit)//GREEN
    println(CreditCardType.SILVER.getValues())//0.02
}


/*IMP NOTE:
* WHEN YOU HAVE A FINITE NUMBER OF CONSTANT VALUES , YOU CAN GROUP THEM TOGETHER IN SOMETHING CALLED ENUM CLASS
* ENUM OBJECTS ARE CONSTANT VALUES, ONCE YOU CREATE THEM , IT CANNOT BE CHANGED
* EACH ENUM CONSTANT IS A SEPARATE INSTANCE OF THE ENUM CLASS
* THEY HAVE PROPERTIES OF name AND ordinal & METHODS OF values() & valueOf().
* YOU CAN ASSIGN YOUR OWN PROPERTIES TO EACH ENUM OBJECT BY USING A CONSTRUCTOR
* ENUM CLASS CAN IMPLEMENT INTERFACES.BUT THEY CANNOT INHERIT FROM ABSTRACT CLASSES OR OPEN CLASSES
* YOU CAN USE ENUM CONSTANTS AS ANONYMOUS CLASSES */
/*  Backing field is represented by 'field' keyword.it is just stores the value of its own property
*   It is used because usage of property name within its getter or setter throws StackOverFlow exception.
*   The backing field is generated by kotlin internally only when it is used in code.
*   Backing 'field' can never be used in any other methods apart from getter and setter.
*   The purpose of the Backing field is holds actual value[age] property data*/

fun main() {
    val z = human()
    z.age
    z.age = 55
}

class human {
    var age = 20
        get() {
            //println("The age is $age")   //Throws StackOverFlow Exception
            println("The age is $field") //'field' keyword stores the value of 'age' property
            return field                 //Returns the value of 'age' property
        }
        set(value) {
            if (value>field)
                println("$value")  //assign the value to age property
            //age=value //ERROR : STATCKOVERFLOW EXCEPTION

        }
}


//Backing field is only generated for those getter ot setter where the usage of'field'Keyword is required,or else No backing field generated

/*
class Human {
    var age = 20
    var name = ""     //No backing field generated
    val isOld: Boolean  //No backing field generated
        get() = age >= 50
}*/
package mykotlin

/* IN KOTLIN VISIBILITY MODIFIER ARE :
* PUBLIC
* PRIVATE
* INTERNAL
* PROTECTED */

// IMP: BY DEFAULT ALL ARE PUBLIC IN NATURE

//IF WE MENTION INTERNAL IT WILL BE VIVIBLE IN SAME MODULE
//PROCTED IS NOT APPLICABLE FOR HIG LEVEL CLASSES.protected keyword will not visible in some other class

open class person {
    private val a = 1 // a is not visible
    protected val b = 2 //B ARE VISIBLE  ONLY INSIDE A SUBCLASS NOT IN OTHER CLASS
    internal val c = 3 //c are visible
    val d = 10//in default its public //b,d,e are visible
    open fun eat() {}
}

class indian : person() {
    fun test() {
    //PRINTLN(A)// A IS NOT VISIBLE IT WILL SHOW ERROR COZ A IS PRIVATE
    }
}




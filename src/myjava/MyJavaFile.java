package myjava;
//ACESS METHOD INSIDE THE KOTLIN CLASS FROM INSIDE THE JAVA CLASS
/*public class myjava.MyJavaFile {
    public static void main(String[] args){
        int sum=InteroperabilityKt.add1(2,3);
        System.out.println("Printing sum for java file :" + sum);
    }
}*/


import mykotlin.InterOperaBility;

//============================================================================================================================================================
//ACESS JAVA METHOD FROM WITHIN THE KOTLIN FILE
public class MyJavaFile {
    public static void main(String[] args) {
        int sum = InterOperaBility.add1(2, 3);
        System.out.println("Printing sum for java file :" + sum);
    }

    public static int getArea(int a, int b) {
        return a*b;
    }
}
//==============================================================================================================================================
//DEFAULT FUNCTIONS

/*public class MyJavaFile {
    public static void main(String[] args) {
        int Total=DefaultFunctionsKt.findVolume(2,3);//IN JAVA DON'T HAVE DEFAULT FUNCTION , IT WILL SHOW ERROR BUT USING Annotaion  @JVMOVERLOADS in KOTLIN CLASS
        System.out.println(Total);
    }
}*/

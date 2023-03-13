public class HelloWorld extends MyClass {
    public static void main (String []args){
        MyClass myObject = new MyClass(); // create object
        System.out.println(myObject.myPublicVar); // printing public variable
        System.out.println(myObject.myProtectedVar); // printing protected variable
    }
}


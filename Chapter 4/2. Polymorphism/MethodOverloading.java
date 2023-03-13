

class MethodOverloading{  
    void Method(){  
        System.out.println("No parameters");  
    }  
    // Overload test for one integer parameter.  
    void Method(int a){  
        System.out.println("a: " + a);  
    }  
    // Overload test for two integer parameters.  
    void Method(int a, int b){  
        System.out.println("a and b: " + a + " " + b);  
    }  
    // overload test for a double parameter  
    double Method(double a){  
        System.out.println("double a: " + a);  
        return a * a;  
    }  
	
	    public static void main(String args[]) {  
        MethodOverloading ob = new MethodOverloading();  
        double result;  
        // call all versions of test()  
        ob.Method();  
        ob.Method(10);  
        ob.Method(10, 20);  
        result = ob.Method(303.23);  
        System.out.println("Result of ob.Method(123.2): " + result);  
    } 
}  
 
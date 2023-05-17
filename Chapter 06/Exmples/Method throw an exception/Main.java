public class Main {
    public static void validateAge(int age) throws Exception{
        if(age<0){
			// create an Exception object to throw  
            throw new Exception("invalide age");
        }	
		System.out.println("Program is running normaly!");
        
    }
    public static void main (String [] args) throws Exception{
        try{
        validateAge(1);
        }catch (Exception e ){
        e.printStackTrace();
        } 
    
    }
}

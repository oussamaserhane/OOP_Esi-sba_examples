public class Main {
															// update method signature with throwed exceptions
    public static void validateAge(int age, double taille) throws AgeDefinedException, TailleDefinedException{
        if(age<0){
           throw new AgeDefinedException ("invalid age inputs !");
        }
        if(taille > 200){
        throw new TailleDefinedException ("invalid Taile input !");
        }
        System.out.println("my program is running !");
    }
	
												// update method signature with throwed exceptions
    public static void main (String [] args) throws AgeDefinedException, TailleDefinedException{
       try{
        validateAge( -1, 250 );    //Todo  change the method inputs to catch defferent exception 
       }catch(AgeDefinedException obj_Variable){
           obj_Variable.printStackTrace();
       }catch(TailleDefinedException obj2_Variable){
           obj2_Variable.printStackTrace();
       }
    }
}

public class AgeDefinedException extends Exception{

    public AgeDefinedException(String message) {
        super(message);
		System.out.println("Im Age exception constructor");
    }
    
}

public class TailleDefinedException extends Exception{

    public TailleDefinedException(String message) {
        super(message);
		System.out.println("Im Taille exception constructor");
    }
    
}

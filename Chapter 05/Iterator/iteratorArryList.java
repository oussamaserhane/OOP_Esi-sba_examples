import java.util.ArrayList;
import java.util.Iterator;

public class iteratorArryList {
	public static void main(String[] args) {

		ArrayList<String> MyList = new ArrayList<String>();
		for (int i=1; i <= 10; i++) { 
			MyList.add(i + " * " + 5 + " = "+i*5);
		}
		Iterator iter = MyList.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}



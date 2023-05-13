import java.util.*;
  
public class HashMapEnrySet2 {
    public static void main(String[] args) {
 
		HashMap<String, Integer> hash_map = new HashMap<>();
        hash_map.put("Geeks", 5);
        hash_map.put("4", 3);
        hash_map.put("Geeks", 6);
        hash_map.put("Welcomes", 9);
        hash_map.put("You", 7);

		// Get the entrySet and Iterator
		Set<Map.Entry<String, Integer>> entrySet = hash_map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

		// Iterate over the entrySet using the Iterator
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " => " + value);
		}

    } }












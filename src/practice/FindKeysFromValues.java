package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindKeysFromValues {
	public static void main(String[] args) { 
		Map<Character, Integer> map = new HashMap<>();
		map.put('c', 1);
		map.put('d', 2);
		map.put('f', 2);
		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
		if (map.containsValue(2)) {
			while (itr.hasNext()) {
				Map.Entry<Character, Integer> entry = itr.next();
				if (entry.getValue() == 2) {
					System.out.println("key " + entry.getKey() + " value " + entry.getValue());
				}
			}
		} else {
			System.out.println("value not found ");
		}
	}
}

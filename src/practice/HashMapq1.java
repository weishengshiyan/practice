package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.w3c.dom.Entity;

public class HashMapq1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("wo2", "zi");
		map.put("wo", "ni");
		map.put("wo1", "ni2");
		Set<Entry<String, String>> settSet = map.entrySet();
		Iterator<Entry<String, String>> iterator = settSet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> aEntry = iterator.next();

			String aString = aEntry.getKey();
			String bString = aEntry.getValue();
			System.out.println(aString + "  " + bString);

		}
	}

}

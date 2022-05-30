package map;

import java.util.TreeMap;

public class CustomizedSortingOrder1 {
	
	/**
	 * Demo Program for Customized Sorting Order(Descending Order):
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m = new TreeMap<Integer, String>((I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);
		
		m.put(100, "Durga");
		m.put(600, "Sunny");
		m.put(300, "Bunny");
		m.put(200, "Chinny");
		m.put(700, "Vinny");
		m.put(400, "Pinny");
		
		System.out.println(m);
	}
}

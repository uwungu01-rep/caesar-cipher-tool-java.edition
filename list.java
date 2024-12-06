package cct; //not China communist party

import java.util.List;

public class list {
	public static int indexOf(String Element, List<String> arr) {
		if(Element.equals(null) || arr.equals(null)) {
			return -1;
		}
		for(int i = 0; i < arr.size(); i++) {
			if(Element.equals(arr.get(i))) {
				return i;
			}
		}
		return -1;
	}
}

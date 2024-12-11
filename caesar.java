package cct;
import java.util.ArrayList;
import java.util.List;

public class caesar {
	public static List<String> Sort(int shift, List<String> alphabet) {
		List<String> output = new ArrayList<String>();
		for(int i = shift; i < alphabet.size() + shift; i++) {
	        if(i < alphabet.size()) {
	        	output.add(alphabet.get(i));
	            continue;
	        }
	        output.add(alphabet.get(i - alphabet.size()));
	    }
	    return output;
	}
	
	public static String Caesar(List<String> alphabet, List<String> upper_alphabet, List<String> shifted, List<String> shifted_upper, List<String> user_input) {
		String output = ""; 
		for(String i : user_input) {
			if(alphabet.contains(i)) {
				output += shifted.get(alphabet.indexOf(i));
			}
			else if(upper_alphabet.contains(i)) {
				output += shifted_upper.get(upper_alphabet.indexOf(i));
			}
			else {
				output += i;
			}
		}
		return output;
	}
}
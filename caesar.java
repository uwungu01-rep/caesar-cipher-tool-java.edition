package cct; //not China communist party
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
	
	public static String Encipher(List<String> alphabet, List<String> upper_alphabet, List<String> shifted, List<String> shifted_upper, String[] user_input) {
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
	
	public static String Decipher(List<String> alphabet, List<String> upper_alphabet, List<String> shifted, List<String> shifted_upper, String[] user_input) {
		String output = ""; 
		for(String i : user_input) {
			if(shifted.contains(i)) {
				output += alphabet.get(shifted.indexOf(i));
			}
			else if(shifted_upper.contains(i)) {
				output += upper_alphabet.get(shifted_upper.indexOf(i));
			}
			else {
				output += i;
			}
		}
		return output;
	}
}
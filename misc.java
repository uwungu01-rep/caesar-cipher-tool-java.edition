package cct;

public class misc {
	public static boolean isInt(String input) {
		try {
			int temp = Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static int Algorithm(int shift) {
	    int temp = shift;
	    if(temp >= 0) {
	        temp = temp % 26;
	        return temp;
	    }
	    while(temp < 0) {
	        temp = (26 + temp) % 26;
	    }
	    return temp;
	}
}

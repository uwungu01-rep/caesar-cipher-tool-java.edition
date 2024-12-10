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
	    if(shift >= 0) {
	        return shift % 26;
	    }
	    return shift % 26 + 26;
	}
}

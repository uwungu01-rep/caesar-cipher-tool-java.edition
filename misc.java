package cct;

public class misc {
	public static boolean isInt(String input) {
		try {
			Long.parseLong(input);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static short Algorithm(long shift) {
	    if(shift >= 0) {
	        return (short) (shift % 26);
	    }
	    return (short) (shift % 26 + 26);
	}
}

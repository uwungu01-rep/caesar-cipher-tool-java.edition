package cct;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
		final List<String> upper_alphabet = Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		List<String> user_input;
		final List<String> COMMAND = Arrays.asList("eEdD".split(""));
		while(true) {
			System.out.print("Type E for Enciphering, type D for Deciphering (Case insensitive). Type / to exit the program: ");
			String cmd = input.nextLine();
			if(cmd.equals("/")) {
				System.exit(0);
			}
			else if(!COMMAND.contains(cmd)) {
				System.out.println("Invalid command.");
				continue;
			}
			while(true) {
				System.out.print("Your input: "); user_input = Arrays.asList(input.nextLine().strip().split(""));
				if(user_input.isEmpty()) {
					System.out.println("Input cannot be empty.");
				}
				else {
					break;
				}
			}
			while(true) {
				System.out.print("Shift (type / to cancel): "); String shift = input.nextLine().strip();
				if(misc.isInt(shift) && (cmd.equals("e") || cmd.equals("E"))) {
					int temp = misc.Algorithm(Long.parseLong(shift));
					List<String> shifted = caesar.Sort(temp, alphabet);
					List<String> shifted_upper = caesar.Sort(misc.Algorithm(Long.parseLong(shift)), upper_alphabet);
					System.out.println("Output: " + caesar.Caesar(alphabet, upper_alphabet, shifted, shifted_upper, user_input));
				}
				else if(misc.isInt(shift) && (cmd.equals("d") || cmd.equals("D"))) {
					int temp = misc.Algorithm(-Long.parseLong(shift));
					List<String> shifted = caesar.Sort(temp, alphabet);
					List<String> shifted_upper = caesar.Sort(misc.Algorithm(Long.parseLong(shift)), upper_alphabet);
					System.out.println("Output: " + caesar.Caesar(alphabet, upper_alphabet, shifted, shifted_upper, user_input));
				}
				else if(shift.equals("/")) {
					break;
				}
				else {
					System.out.println("Invalid input.");
				}
			}
		} 
	}
}

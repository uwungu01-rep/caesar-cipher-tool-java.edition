package cct; //not China communist party
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
		final List<String> upper_alphabet = Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		while(true) {
			System.out.print("Type E for Enciphering, type D for Deciphering (Case insensitive). Type / to exit the program: ");
			String cmd = input.nextLine();
			boolean run = true;
			if(cmd.equals("e") || cmd.equals("E")) {
				while(run) {
					System.out.print("Your input: ");String user_input = input.nextLine().strip();
					if(user_input.isEmpty()) {
						System.out.println("Input cannot be empty.");
						continue;
					}
					while(run) {
						String[] temp = user_input.split("");
						System.out.print("Shift (type / to cancel): ");String shift = input.nextLine().strip();
						if(misc.isInt(shift)) {
							List<String> shifted = caesar.Sort(misc.Algorithm(Integer.parseInt(shift)), alphabet);
							List<String> shifted_upper = caesar.Sort(misc.Algorithm(Integer.parseInt(shift)), upper_alphabet);
							System.out.println("Output: " + caesar.Encipher(alphabet, upper_alphabet, shifted, shifted_upper, temp));
						}
						else if(shift.equals("/")) {
							run = false;
						}
						else {
							System.out.println("Invalid input.");
						}
					}
				}
			}
			else if(cmd.equals("d") || cmd.equals("D")) {
				while(run) {
					System.out.print("Your input: "); String user_input = input.nextLine().strip();
					if(user_input.isEmpty()) {
						System.out.println("Input cannot be empty.");
						continue;
					}
					while(run) {
						String[] temp = user_input.split("");
						System.out.print("Shift (type / to cancel): "); String shift = input.nextLine().strip();
						if(misc.isInt(shift)) {
							List<String> shifted = caesar.Sort(misc.Algorithm(Integer.parseInt(shift)), alphabet);
							List<String> shifted_upper = caesar.Sort(misc.Algorithm(Integer.parseInt(shift)), upper_alphabet);
							System.out.println("Output: " + caesar.Decipher(alphabet, upper_alphabet, shifted, shifted_upper, temp));
						}
						else if(shift.equals("/")) {
							run = false;
						}
						else {
							System.out.println("Invalid input.");
						}
					}
				}
			}
			else if(cmd.equals("/")) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid command.");
			}
		}
	}
}

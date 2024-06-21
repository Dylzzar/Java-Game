import java.util.*;
import java.io.*;

public class Main {

static Scanner sc = new Scanner(System.in);

	public Character diffChoice() {
		boolean incorrect = true;
		int choice = 0;
		while (incorrect) {
			try {
				System.out.println("Choose you difficulty:\nEasy\nMedium\nHard");
				choice = sc.nextInt();
				if (choice > 3 || choice < 0) choice = "Err";
				incorrect = false;
			}
			catch (Exception e) {
				System.err.println("Thats not a correct input");
			}
		}
		return new Character(choice);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		Character Player = obj.diffChoice();
		System.out.println("Hello world!"); //this is a commeent
		System.out.println(Player.health());
	}
}

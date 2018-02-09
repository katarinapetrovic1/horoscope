
import java.util.Scanner;
/**
 * 
 * @author katarina
 *
 */

public class HoroscopeProject {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int month, day;
		
		System.out.print("Enter your birth month (1-12): ");
		month = input.nextInt();
		
		System.out.print("Enter your birth day (1-31): ");
		day = input.nextInt();
		
		if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day  <= 17))
				System.out.println("You are an Aquarius!" + System.lineSeparator() + "A copious amout of money will be coming your way.");
			if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19))
				System.out.println("You are a pisces!" + System.lineSeparator() + "You will find luck in your love life this week.");
			if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19))
				System.out.println("You are an Aries!" + System.lineSeparator() + "This week will bring you happiness in your work life.");
			if ((month == 4 &&  day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20))
				System.out.println("You are a Taurus!)" + System.lineSeparator() + "This week will bring your closer to your family.");
			if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20))
				System.out.println("You are a Gemini!" + System.lineSeparator() + "A new job opportunity will be coming your way.");
			if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22))
				System.out.println("You are a Cancer!" + System.lineSeparator() + "Somebody close you will invite you on a spontaneous trip this week.");
			if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22))
				System.out.println("You are a Leo!" + System.lineSeparator() + "A great career shift will be coming your way.");
			if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22))
				System.out.println("You are a Virgo!" + System.lineSeparator() + "This week will bring you a lot of energy and great health.");
			if ((month == 9 && day >= 23 && day <= 31) || (month == 10 && day >= 1 && day <= 22))
				System.out.println("You are a Libra!" + System.lineSeparator() + "This week will bring you a close connection to somebody new.");
			if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
				System.out.println("You are a Scorpio!" + System.lineSeparator() + "You will rekindle a romantic relationship with the love of your life this week.");
			if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
				System.out.println("You are a Sagittarius!" + System.lineSeparator() + "Great monetary fortune will be coming your way.");
			if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <=19)) {
				System.out.println("You are a Capricorn!" + System.lineSeparator() + "The greatest problem in your life will be resolved this week.");
	
			}
		
	}
	
}


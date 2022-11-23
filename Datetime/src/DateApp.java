import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateApp {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a date in the format mm/dd/yyyy: ");
			String date = input.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			try {
				Date d = sdf.parse(date);
				System.out.println("Date: " + d);
			} catch (ParseException e) {
				System.out.println("Invalid date");
			}
		}
	}
}

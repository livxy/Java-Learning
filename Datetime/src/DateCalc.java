
/**
 * DateCalc
 * 
 * @author livxy
 * @version 1.0
 * @since 11-23-2022
 * 
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.ParseException;

public class DateCalc {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the date in the format of yyyy-MM-dd HH:mm:ss");
			String input = sc.nextLine();
			String regex = "^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if (matcher.matches()) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date date = sdf.parse(input);
					Calendar calendar = new GregorianCalendar();
					calendar.setTime(date);
					System.out.println("The date you entered is " + sdf.format(date));
					System.out.println("The year is " + calendar.get(Calendar.YEAR));
					System.out.println("The month is " + (calendar.get(Calendar.MONTH) + 1));
					System.out.println("The day is " + calendar.get(Calendar.DAY_OF_MONTH));
					System.out.println("The hour is " + calendar.get(Calendar.HOUR_OF_DAY));
					System.out.println("The minute is " + calendar.get(Calendar.MINUTE));
					System.out.println("The second is " + calendar.get(Calendar.SECOND));
					System.out.println("The day of the week is " + calendar.get(Calendar.DAY_OF_WEEK));
					System.out.println("The day of the year is " + calendar.get(Calendar.DAY_OF_YEAR));
					System.out.println("The week of the year is " + calendar.get(Calendar.WEEK_OF_YEAR));
					System.out.println("The week of the month is " + calendar.get(Calendar.WEEK_OF_MONTH));
					System.out.println("The day of the week in the month is " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
					System.out.println("The AM_PM is " + calendar.get(Calendar.AM_PM));
					System.out.println("The time zone is " + calendar.getTimeZone().getDisplayName());
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("The date you entered is not in the correct format");
			}
		}
	}
}
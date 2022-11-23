
import java.util.Calendar;


public class HolidayCalculator {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("The upcoming holidays are:");
        // New Year's Day
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("New Year's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Valentine's Day
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        System.out.println("Valentine's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // St. Patrick's Day
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 17);
        System.out.println("St. Patrick's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // April Fool's Day
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("April Fool's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Mother's Day
        calendar.set(Calendar.MONTH, 4);
        calendar.set(Calendar.DAY_OF_MONTH, 9);
        System.out.println("Mother's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Father's Day
        calendar.set(Calendar.MONTH, 5);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println("Father's Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Independence Day
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        System.out.println("Independence Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Labor Day
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 6);
        System.out.println("Labor Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Columbus Day
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DAY_OF_MONTH, 9);
        System.out.println("Columbus Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Halloween
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        System.out.println("Halloween: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Veterans Day
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 11);
        System.out.println("Veterans Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Thanksgiving Day
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        System.out.println("Thanksgiving Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
        // Christmas Day
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println("Christmas Day: " + (calendar.get(Calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR)) + " days from today");
    }
}


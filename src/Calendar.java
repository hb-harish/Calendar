import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
		month = month -1;
		System.out.println("Enter the year");
		int year = sc.nextInt();
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 1 && year%4==0 && year%100!=0 ) days[month] = 29;
		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		//String m = months[gc.get(Calendar.month)];
		System.out.println( "\n         "+ months[month] + " " + year); 
		System.out.println("---------------------------");
		System.out.printf("%s %s %s %s %s %s %s\n","Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		int d = gc.get(gc.DAY_OF_WEEK);
		d = d-1;
		for (int i = 0; i < d; i++)
            System.out.print("    ");
        for (int i = 1; i <= days[month]; i++) 
        {
            System.out.printf(" %2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }
	}
}

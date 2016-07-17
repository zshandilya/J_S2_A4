import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		String month;
		char ans;
		Scanner s=new Scanner(System.in);
		
		do
		{
			System.out.print("Enter the month: ");
			month=s.next().toLowerCase();
			switch(month)
			{
				case "january":
				case "march":
				case "may":
				case "august":
				case "july":
				case "october":
				case "december":
				{
					System.out.println("This month has 31 days.");
					break;
				}
				case "february":
				{
					System.out.println("This month has 28/29 days.");
					break;
				}
				case "april":
				case "june":
				case "september":
				case "november":
				{
					System.out.println("This month has 30 days.");
					break;
				}
				default:
				{
					System.out.println(month+" is an Invalid Month.");
					break;
				}
			}
			System.out.print("\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
		} while (ans=='y');
		
		s.close();

	}

}

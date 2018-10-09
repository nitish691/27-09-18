import java.util.Scanner;
class Date
{
	private String date;
	private int dd, mm, yyyy;
	
	Date(String date)
	{
		this.date = date;
	}
	
	String calculateDate()
	{
		String english = new String();
		int i, pos1 = 0, pos2 = 0;
		for(i=0;i<date.length();i++)
		{
			if(date.charAt(i) == '/')
			{
				pos1 = i;
				break;
			}
		}
		for(i=pos1+1;i<date.length();i++)
		{
			if(date.charAt(i) == '/')
			{
				pos2 = i;
				break;
			}
		}
		dd = Integer.parseInt(date.substring(0,pos1));
		mm = Integer.parseInt(date.substring(pos1+1,pos2));
		yyyy = Integer.parseInt(date.substring(pos2+1,date.length()));
		
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		english = dd + " " + months[mm-1] + " " + yyyy;
		return english;
	}
}
public class Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a date in DD/MM/YYYY format : ");
		String date = sc.next();
		Date obj = new Date(date);
		System.out.println("The entered date : " + obj.calculateDate());
		sc.close();
	}	
}
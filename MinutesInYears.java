package myCaptain;
import java.util.Scanner;
public class MinutesInYears {
	public static void main(String[] args) {
		// 1 day = 1440 mins
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes :");
		int mins = sc.nextInt();
		int days,years;
		years = changeToYears(mins);
		days  = changeToDays(mins);
		System.out.println(mins + " minutes is approximately " + years + " years and " + days + " days.");
		
		
	}
	public static int changeToDays(int m) {
		int d;
		d = (m/1440)%365;
		return d;
	}
	
	public static int changeToYears(int m) {
		int y;
		y = (m/1440)/365;
		return y;
	}

}

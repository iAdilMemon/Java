import java.util.Scanner;
class CalculateSpeed{

	public static void main(String args[])
	{

	Scanner sc = new Scanner (System.in);
	System.out.print("Enter distance in meters = ");
	short distance = sc.nextShort();
	System.out.print("Enter time in seconds = ");
	short time = sc.nextShort();
	int speed = distance/time;
	System.out.println("Speed = " + speed + " m/s ");

	}
}





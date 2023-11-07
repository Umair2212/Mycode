
import java.util.Scanner;
class Testb
{
 public static void main(String args[])
 {
     Scanner input= new Scanner(System.in);
 System.out.print("Enter First integer: ");
     int x = input.nextInt();
     System.out.print("Enter Second integer: ");
     int y = input.nextInt();
     System.out.print("Enter Third integer: ");
     int z = input.nextInt();
 if ( x > y && x > z )
 System.out.println("First number is largest: "+x);
 else if ( y > x && y > z )
 System.out.println("Second number is largest: "+y);
 else 
 System.out.println("Third number is largest: "+z);
 }
}

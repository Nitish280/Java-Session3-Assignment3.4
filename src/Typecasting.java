import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Input first number: ");  
	    byte num1 = in.nextByte();
	    
	    System.out.println("Input first number: ");  
	    short num2 = in.nextShort();
	    
	    byte x = num1;
	    short y = num2;
	    int z=0;
	    long u=0;
	    float v=0;
	    double d=0;
	    
	    z=x+y;
	    System.out.println("Sum of byte and short:" +z);
	    u=y+z;
	    System.out.println("Sum of short and int:" +u);
	    v=z+u;
	    System.out.println("Sum of int and long:" +v);
	    d=v+u;
	    System.out.println("Sum of float and double:" +d);
	    
	     }

}

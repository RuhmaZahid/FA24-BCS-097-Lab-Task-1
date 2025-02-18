import java.util.Scanner;

public class InputDemo{

	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		

		System.out.println("This is Input Demo Code");

	//Integer primitive types
		byte b=1; 
		short s=123;
		int i=1000;
		long l=273653643;

	System.out.print("Enter byte value: ");
	b=input.nextByte();  //variable name start from capital letter

	System.out.print("Enter short value: ");
	s=input.nextShort();

	System.out.print("Enter int value: ");
	i=input.nextInt();
	
	System.out.print("Enter long value: ");
	l=input.nextLong();

		
	//types with decimal values
		float f=10.0f; //f is for compiler so it consider this number a float . (float is 4 bytes)
		double d=100.00;      //15 decimal places and 8 bytes

        System.out.print("Enter float value: ");
	f=input.nextFloat();

	System.out.print("Enter double value: ");
	d=input.nextDouble();


	//for char
		char c='j'; //for null c='\n'
       //no input function for character
       	
	//for string
  		String str;
	System.out.print("Enter string: ");
	str=input.next();


	//for binary values
		boolean bool=true;
	System.out.print("Enter boolean value: ");
	bool=input.nextBoolean();




		//System.out.printf(" ",  );

		System.out.printf("Value in byte:%04d\n",b);

		System.out.printf("Value in short:\t%d\n",s);

  		System.out.printf("Value in int:%d\n",i);

		System.out.printf("Value in long:%d\n",l);

		System.out.printf("Value in float:%.2f\n",f);
		
		System.out.printf("Value in double:%,.1f\n",d);
		
		System.out.printf("Value in string \t %s\n ",str);

		
	
		
 		
    }


}

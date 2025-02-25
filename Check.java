import java.util.Scanner;
public class Check{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

	
	String Name;
	String Password;

	System.out.print("Enter Username:");
	Name=input.nextLine();



	System.out.print("Enter Password:");
	Password=input.nextLine();

	if (Name.equals(Username.userName)){
	System.out.print("\nUsername is a match");
}
	else{
	System.out.print("\nIncorrect Username");
}
	 if (Password.equals(Username.password)) {
	System.out.print("\nPassword is a match");
}
	else{
	System.out.print("\nIncorrect password");
}
}
}
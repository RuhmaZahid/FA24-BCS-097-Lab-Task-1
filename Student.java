public class Student{
   	private String name;
	private String regNo;
	private String address;
  	private double gpa;
	private String phoneNumber;
	private static int counter=0;


	public Student(String name,String address,double gpa,String phoneNumber){
	this.name=name;
	this.address=address;
	this.gpa=gpa;
	this.phoneNumber=phoneNumber;
	regNo=String.format("FA24-BCS-%03d",counter++);
	
}

	public void display(){
	System.out.printf("Name:%s\n",name);
	System.out.printf("Registration Number:%s\n",regNo);
	System.out.printf("Address: %s\n",address);
	System.out.printf("GPA: %f\n",gpa);
	System.out.printf("Phone Number:%s\n",phoneNumber);
}
	public static void main( String args[]){

		Student s1=new Student("Ayesha","Lahore",3.4,"1111111");
                Student s2=new Student("Sara","Lahore",3.5,"222222");
                s1.display();
		s2.display();
	}


}
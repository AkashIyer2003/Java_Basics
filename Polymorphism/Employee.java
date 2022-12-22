import java.util.Scanner;
class Employee{
String Emp_name;
int Emp_id;
String Address;
String Mail_id;
int Mobile_no;
void display(){
System.out.println(Emp_name);
System.out.println(Emp_id);
System.out.println(Mail_id);
System.out.println(Mobile_no);
}
}
class Programmer extends Employee{  
int BP; 
void display(){
    	System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
 	System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
        
}
} 
class Assistant_Professor extends Employee{  
int BP; 

void display(){
    	System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
 	System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
        
}
} 
class Associate_Professor extends Employee{  
int BP; 
void display(){
    	System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
	System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
        
}
} 
class Professor extends Employee{  
int BP; 
void display(){
    	System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
 	System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
        
}
} 
class Main{ 
public static void main(String args[]){
	System.out.println("\n1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int ch=input.nextInt();
switch (ch) {
         case 1:
           Employee e1=new Employee();
           Programmer p1=new Programmer();
           e1.Emp_name="Akash Iyer";
           e1.Address="Trivandrum";
           e1.Mail_id="akash21110024@snuchennai.edu.in";
           e1.Emp_id=21110024;
           e1.Mobile_no=79073554;
           p1.BP=15000;
           p1.display();
              e1.display();
              break;
         case 2:
           Employee e2=new Employee();
           Assistant_Professor p2=new Assistant_Professor();
           e2.Emp_name="Aravind Rajan";
           e2.Address="Chennai";
           e2.Mail_id="RAJAN@gmail.com";
           e2.Emp_id=21110318;
           e2.Mobile_no=98888882;
           p2.BP=30000;
           p2.display();
              e2.display();
              break;
         case 3:
           Employee e3=new Employee();
           Associate_Professor p3=new Associate_Professor();
           e3.Emp_name="Raghav George";
           e3.Address="Hyderabad";
           e3.Mail_id="AssociateProf@gmail.com";
           e3.Emp_id=21110456;
           e3.Mobile_no=98710739;
           p3.BP=30000;
           p3.display();
              e3.display();
              break;
         case 4:
           Employee e4=new Employee();
           Professor p4=new Professor();
           e4.Emp_name="KANNAN";
           e4.Address="TRICHY";
           e4.Mail_id="kanna@gmail.com";
           e4.Emp_id=21110789;
           e4.Mobile_no=98103162;
           p4.BP=30000;
           p4.display();
              e4.display();
              break;
         case 5:
           //exit(1);
         
         default: 
          System.out.println("enter correct choice");
   
      } 
}
}

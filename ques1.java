import java.util.Scanner;
class Person {
    void name (String name){
    System . out . println (" Name is ... " + name  );
    } 

    void gender(String gender){
        System.out.println("Gender is...." + gender);
    }
}
    class Student extends Person {
    void roll (int roll){
        System . out . println (" Roll is ... "+ roll );
}
    void branch(String branch){
        System.out.println("Branch is ..."+ branch);
    }
}
class ques1 {
public static void main ( String args []) {
System.out.println("Rahul Raj ");
System.out.println("2330327");   
Scanner sc= new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.nextLine();
System.out.println("Enter your roll");
int roll=sc.nextInt();
sc.nextLine();
System.out.println("Enter your gender");
String gender=sc.nextLine();
System.out.println("Enter your Branch");
String branch=sc.nextLine();


Student stud = new Student ();
stud . roll (roll);
stud . name (name);
stud. gender(gender);
stud. branch(branch);
sc.close();
}}
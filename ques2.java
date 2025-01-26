import java.util.Scanner;

class Person {
    void name (String name){
    System . out . println (" Name is ... "+name );
    } }
    class Student extends Person {
       
    void roll (int roll){
       
    System . out . println (" Roll is ... " +roll);
    } }
    class FirstYear extends Student {
    void year (){
    System . out . println (" 1 st year ... " );
    } }
    class Firstsem extends FirstYear{
        void subjects(){
            System.out.println("6 theory subjects and 2 lab records");
           
        }
    }
    class secondyear extends Student{
        void year2(){
            System.out.println("2nd year...");
        }

    }
    class thirdyear extends Student{
        void year3(){
            System.out.println("3rd year...");
        }
    }
    class fourthyear extends Student{
        void year4(){
            System.out.println("4th year...");
        }
    }
    class ques2 {
    public static void main ( String args []) {
    System.out.println("Rahul Raj ");
    System.out.println("2330327"); 
    System.out.println("Rahul Raj ");
    System.out.println("2330327");   
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.nextLine();
    System.out.println("Enter your roll");
    int roll=sc.nextInt();
    sc.nextLine();
   
    
    Firstsem stud = new Firstsem ();
    stud . year ();
    stud . roll (roll);
    stud . name (name);
    stud. subjects ();
    secondyear stud2= new secondyear();
    stud2. year2();
    thirdyear stud3= new thirdyear();
    stud3.year3();
    fourthyear stud4= new fourthyear();
    stud4.year4();
    sc.close();
    }}

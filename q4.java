import java.util.Scanner;

class UniversityMember {
    String name;
    String gender;

    UniversityMember() {
        name = "";
        gender = "";
    }

    UniversityMember(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void display_name() {
        System.out.println("Name is: " + name);
    }

    void display_gender() {
        System.out.println("Gender is: " + gender);
    }
}

class Student extends UniversityMember {
    String course;
    String branch;

    Student() {
        course = "";
        branch = "";
    }

    Student(String name, String gender, String course, String branch) {
        super(name, gender);
        this.course = course;
        this.branch = branch;
    }

    void display_course() {
        System.out.println("Course is: " + course);
    }

    void display_branch() {
        System.out.println("Branch is: " + branch);
    }
}

class Year extends Student {
    String yearID;
    String semID;
    double sgpa;

    Year() {
        yearID = "";
        semID = "";
        sgpa = 0.0;
    }

    Year(String name, String gender, String course, String branch, String yearID, String semID, double sgpa) {
        super(name, gender, course, branch);
        this.yearID = yearID;
        this.semID = semID;
        this.sgpa = sgpa;
    }

    void display_yearID() {
        System.out.println("Year ID is: " + yearID);
    }

    void display_semID() {
        System.out.println("SemID is: " + semID);
    }

    void display_sgpa() {
        System.out.println("SGPA is: " + sgpa);
    }
}

public class q4 {
    public static void main(String[] args) {
        System.out.println("Rahul Raj");
        System.out.println("2330327");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Gender:");
        String gender = sc.nextLine();

        System.out.println("Enter Student course:");
        String course = sc.nextLine();

        System.out.println("Enter Student Branch:");
        String branch = sc.nextLine();

        System.out.println("Enter Student YearID:");
        String yearID = sc.nextLine();

        System.out.println("Enter Student SemID:");
        String semID = sc.nextLine();

        System.out.println("Enter Student SGPA:");
        double sgpa = sc.nextDouble(); 
        
        
        Year stud = new Year(name, gender, course, branch, yearID, semID, sgpa);

        
        stud.display_name();
        stud.display_gender();
        stud.display_course();
        stud.display_branch();
        stud.display_yearID();
        stud.display_semID();
        stud.display_sgpa();

        sc.close(); 
    }
}
import java.util.Scanner;

class Person {
    String name;
    String gender;

    Person() {
        this.name = "";
        this.gender = "";
    }

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void Name() {
        System.out.println("Name is: " + name);
    }

    void Gender() {
        System.out.println("Gender is: " + gender);
    }
}

class Student extends Person {
    int roll;
    String branch;

    Student() {
        super();
        this.roll = 0;
        this.branch = "";
    }

    Student(String name, String gender, int roll, String branch) {
        super(name, gender);
        this.roll = roll;
        this.branch = branch;
    }

    void Roll() {
        System.out.println("Roll number is: " + roll);
    }

    void Branch() {
        System.out.println("Branch is: " + branch);
    }
}

class FirstYear extends Student {
    FirstYear() {
        super();
    }

    FirstYear(String name, String gender, int roll, String branch) {
        super(name, gender, roll, branch);
    }

    void year() {
        System.out.println("1st Year ... ");
    }
}

class FirstSem extends FirstYear {
    FirstSem() {
        super();
    }

    FirstSem(String name, String gender, int roll, String branch) {
        super(name, gender, roll, branch);
    }

    void Subjects() {
        System.out.println("6 Theory Courses and 2 Lab Courses");
    }
}

class SecondYear extends Student {
    void year1() {
        System.out.println("2nd Year ... ");
    }
}

class ThirdYear extends Student {
    void year2() {
        System.out.println("3rd Year ... ");
    }
}

class FourthYear extends Student {
    void year3() {
        System.out.println("4th Year ... ");
    }
}

class ques3 {
    public static void main(String[] args) {
        System.out.println("Rahul Raj");
        System.out.println("2330327");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Roll No.:");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Gender:");
        String gender = sc.nextLine();

        System.out.println("Enter Student Branch:");
        String branch = sc.nextLine();

        FirstSem stud = new FirstSem(name, gender, roll, branch);

        stud.year();
        stud.Roll();
        stud.Name();
        stud.Gender();
        stud.Branch();
        stud.Subjects();

        SecondYear stud2 = new SecondYear();
        stud2.year1();

        ThirdYear stud3 = new ThirdYear();
        stud3.year2();

        FourthYear stud4 = new FourthYear();
        stud4.year3();

        sc.close();
    }
}

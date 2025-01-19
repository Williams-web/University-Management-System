import java.util.ArrayList;
import java.util.Scanner;

public class UniversityDriverMenu {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void admitNewStudent(){
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter Student Name: ");
        student.studentName = input.nextLine();

        System.out.println("Enter Registration Number: ");
        student.regdNo = input.nextLine();

        System.out.println("Enter Elective Subject: ");
        student.electiveSubject = input.nextLine();

        System.out.println("Enter Average Marks: ");
        student.avgMarks = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Hostel Name: ");
        student.hostelName = input.nextLine();

        System.out.println("Enter Hostel Location: ");
        student.hostelLocation = input.nextLine();

        System.out.println("Enter Number of Rooms: ");
        student.numberOfRooms = input.nextInt();
        input.nextLine();

        studentList.add(student);
        System.out.println("Student Admitted Successfully!");
    }

    public void migrateStudent(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Registration number ");
       String regdNo = input.nextLine();

       for(Student student : studentList){
           if(student.regdNo.equals(regdNo)){
               System.out.println("Enter new Hostel Name: ");
               student.hostelName = input.nextLine();

               System.out.println("Enter new Hostel Location: ");
               student.hostelLocation = input.nextLine();

               System.out.println("Enter new Number of Rooms: ");
               student.numberOfRooms = input.nextInt();

               System.out.println("Student migrated successfully!");
           }else {
               System.out.println("Student with Registration Number " + regdNo + " not found!");
           }

       }

    }

    public void displayStudentDetails(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Registration Number: ");
        String regdNo = input.nextLine();

        for (Student student : studentList){
            if(student.regdNo.equals(regdNo)){
                System.out.println(student.getStudentDetails());
                 return;
            }
        }
        System.out.println("Student with Registration Number " + regdNo + " not found!");
    }

    public void displayMenu(){
        UniversityDriverMenu menu = new UniversityDriverMenu();
        Scanner input = new Scanner(System.in);


       while (true){
           System.out.println("Menu");
           System.out.println("1. Admit New Student");
           System.out.println("2. Migrate Student");
           System.out.println("3. Display Student Details");
           System.out.println("4. Exit");
           System.out.println("Enter your choice: ");

           int choice = input.nextInt();
           input.nextLine();

           switch (choice){
               case 1:
                   menu.admitNewStudent();
                   break;
               case 2:
                   menu.migrateStudent();
                   break;
               case 3:
                   menu.displayStudentDetails();
                   break;
               case 4:
                   System.out.println("Exiting...");
                   return;
               default:
                   System.out.println("Invalid Choice! Please enter a valid choice.");

           }
       }

    }

    }



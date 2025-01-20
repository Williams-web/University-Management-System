import java.util.ArrayList;
import java.util.Scanner;

public class UniversityDriverMenu {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void admitNewStudent(){
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter Student Name: ");
        student.studentName = input.nextLine();
        if (student.studentName.isEmpty()){
            System.out.println("Student name cannot be empty");
            return;
        }

        System.out.println("Enter Registration Number: ");
        student.regdNo = input.nextLine();
        if (student.regdNo.isEmpty()){
            System.out.println("Registration number cannot be empty");
            return;
        }

        System.out.println("Enter Elective Subject: ");
        student.electiveSubject = input.nextLine();
        if (student.electiveSubject.isEmpty()){
            System.out.println("Elective subject cannot be empty");
            return;
        }

        System.out.println("Enter Average Marks: ");
        student.avgMarks = input.nextDouble();
        if (student.avgMarks <0){
            System.out.println("Average mark cannot be less than 0");
            return;
        }
        input.nextLine();


        System.out.println("Enter Hostel Name: ");
        student.hostelName = input.nextLine();
        if (student.hostelName.isEmpty()){
            System.out.println("Hostel name cannot be empty");
            return;
        }

        System.out.println("Enter Hostel Location: ");
        student.hostelLocation = input.nextLine();
        if (student.hostelLocation.isEmpty()){
            System.out.println("Hostel location cannot be empty");
            return;
        }

        System.out.println("Enter Number of Rooms: ");
        student.numberOfRooms = input.nextInt();
        if (student.numberOfRooms < 1 ){
            System.out.println("Number of rooms cannot be less than 1");
            return;
        }
        input.nextLine();

        studentList.add(student);
        System.out.println("Student Admitted Successfully!");
    }

    public void migrateStudent(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Registration number ");
       String regdNo = input.nextLine();
       if (regdNo.isEmpty()){
           System.out.println("Registration number cannot be empty");
           return;
       }

       for(Student student : studentList){
           if(student.regdNo.equals(regdNo)){
               System.out.println("Enter new Hostel Name: ");
               student.hostelName = input.nextLine();
               if (student.hostelName.isEmpty()){
                   System.out.println("Hostel name cannot be empty");
                   return;
               }

               System.out.println("Enter new Hostel Location: ");
               student.hostelLocation = input.nextLine();
                if (student.hostelLocation.isEmpty()){
                     System.out.println("Hostel location cannot be empty");
                     return;
                }

               System.out.println("Enter new Number of Rooms: ");
               student.numberOfRooms = input.nextInt();
               if (student.numberOfRooms < 1){
                   System.out.println("Number of rooms cannot be less than 1");
                   return;
               }

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



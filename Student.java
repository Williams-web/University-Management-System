public class Student extends Hostel implements Department {
    public String studentName;
    public String regdNo;
    public String electiveSubject;
    public double avgMarks;

    public String getStudentDetails(){
        return "Student Name: " + studentName +
                "\nRegistration Number: " + regdNo +
                "\nElective Subject: " + electiveSubject +
                "\nAverage Marks: " + avgMarks +
                "\n" + printHostelDetails() +
                "\nDepartment Name: " + deptName ;
    }


    @Override
    public void printDepartmentDetails() {
        System.out.println("Department Name: " + deptName + "\nDepartment Head: " + deptHead);
    }


}

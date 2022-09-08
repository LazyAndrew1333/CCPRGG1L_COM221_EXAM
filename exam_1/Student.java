public class Student {

    // Student Attributes
    String surName;
    String firstName;
    String middleName;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String emailAddress;
    Boolean iAmAwesome;

    // Student Method
    public void myInfo() {
        System.out.println("Surname: " + surName + "\n" + "Firstname: " + firstName + "\n" + "Middle Initial: " + middleInitial + "\n" + "Date of birth: " + dateOfBirth);
    }

    public void sayMyStudentNumber() {
        System.out.println("Student Number: " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("Student E-mail Address: " + emailAddress);
    }

    public void amIAwesome() {
        System.out.println("Am I awesome?? " + iAmAwesome);
    }

    // Constructor
    public Student(String studentSurname,String studentFirstName, String studentMiddleName, char studentMiddleInitial, String studentDateOfBirth, int studentStudentNumber, String studentEmailAddress, Boolean amIAweseome) {
        surName = studentSurname;
        firstName = studentFirstName;
        middleName = studentMiddleName;
        middleInitial = studentMiddleInitial;
        dateOfBirth = studentDateOfBirth;
        studentNumber = studentStudentNumber;
        emailAddress = studentEmailAddress;
        iAmAwesome = amIAweseome;
    }
}

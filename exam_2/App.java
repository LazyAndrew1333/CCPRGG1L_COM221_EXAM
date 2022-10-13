import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        
        numberOne();
        
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        numberTwo();

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)

        numberThree();
        
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        numberFour();

        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)

        numberFive();

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)

        numberSix();

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)

        numberSeven();

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        numberEight();

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        numberNine();

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)

        numberTen();

    }
    
    static void numberOne(){
        System.out.println("\n1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }

    static void numberTwo(){
        System.out.println("\n2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();

        int i, m = 0, flag = 0;
        m = lastDigit/2;

        if (lastDigit==0||lastDigit==1){
            System.out.println("NEITHER");
        }   else{
            for(i = 2;i <= m; i++){
                if (lastDigit % i ==0){
                    System.out.println("COMPOSITE");
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("PRIME");
            }
        }
    }

    static void numberThree(){
        System.out.println("\n3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        int totalChar = firstName.length() + surName.length();

        System.out.println("First name: " + firstName.length());
        System.out.println("Surname: " + surName.length());
        System.out.println("The total characters of your name is: " + totalChar);
    }

    static void numberFour(){
        System.out.println("\n4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The largest number is: " + firstNumber);
        }else{
            if (secondNumber > firstNumber && secondNumber > thirdNumber){
                System.out.println("The largest number is: " + secondNumber);
            }else{
                if (thirdNumber > firstNumber && thirdNumber > secondNumber){
                    System.out.println("The largest number is: " + thirdNumber);
                }
            }
        }
    }

    static void numberFive(){
        System.out.println("\n5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastSixDigits = studentNumber - 2022000000;

        System.out.println(lastSixDigits);
    }

    static void numberSix(){
        System.out.println("\n6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        boolean sixIsValid;

        if (studentNumber == 2022103606){
            sixIsValid = true;
        }else{
            sixIsValid = false;
        }

        if (sixIsValid = true){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }

    static void numberSeven(){
        System.out.println("\n7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();
        boolean fNameIsUppercase;
        boolean sNameIsLowercase;

        if (firstName == firstName.toUpperCase()){
            fNameIsUppercase = true;
        }else{
            fNameIsUppercase = false;
        }

        if (surName == surName.toLowerCase()){
            sNameIsLowercase = true;
        }else{
            sNameIsLowercase = false;
        }

        if (fNameIsUppercase = true){
            if (sNameIsLowercase = true){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
        }else{
            System.out.println("invalid");
        }
    }

    static void numberEight(){
        System.out.println("\n8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
        boolean isEnrolled;

        if (course == "BSIT"){
            System.out.println("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();
            if (specialization1 == "MWAA"){
                System.out.println("valid");
            }else{
                if (specialization1 == "MAA"){
                    System.out.println("valid");
                }else{
                    System.out.println("invalid");
                }
            }
        }else{
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            if (specialization2 == "DF"){
                System.out.println("valid");
            }else{
                if (specialization2 == "ML"){
                    System.out.println("valid");
                }else{
                    System.out.println("invalid");
                }
            }
        }
    }

    static void numberNine(){
        System.out.println("\n9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand){
            case "STEM":
                System.out.println("valid");
                break;

            case "ICT":
                System.out.println("valid");
                break;

            case "HUMSS":
                System.out.println("valid");
                break;

            case "HOME ECONOMICS":
                System.out.println("valid");
                break;

            case "ARTS AND DESIGN":
                System.out.println("valid");
                break;

            case "TVL MARITIME":
                System.out.println("valid");

           default:
                System.out.println("invalid");
        }
    }

    static void numberTen(){
        System.out.println("\n10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        boolean isEmailValid;

        if (studentEmailAddress == "divinajm@students.national-u.edu.ph"){
            isEmailValid = true;
        }else{
            isEmailValid = false;
        }

        if (isEmailValid = true){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        // Student Class
        Student Andrew = new Student("Divina", "John Andrew","Marzan", 'M', "27/01/04", 103606, "divinajm@students.national-u.edu.ph", true);
        Andrew.myInfo();
        Andrew.sayMyEmailAddress();
        Andrew.sayMyStudentNumber();
        Andrew.amIAwesome();
    }
}

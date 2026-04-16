import java.util.*;

public class SmartCampus {
    static Scanner sc = new Scanner(System.in);

    static HashMap<Integer, Student> students = new HashMap<>();
    static HashMap<Integer, CourseImpl> courses = new HashMap<>();
    static HashMap<Integer, ArrayList<CourseImpl>> enrollments = new HashMap<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Smart Campus Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        addCourse();
                        break;
                    case 3:
                        enrollStudent();
                        break;
                    case 4:
                        viewStudents();
                        break;
                    case 5:
                        viewEnrollments();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        students.put(id, new Student(id, name, email));
        System.out.println("Student Added!");
    }

    static void addCourse() throws InvalidFeeException {
        System.out.print("Enter Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();

        courses.put(id, new CourseImpl(id, name, fee));
        System.out.println("Course Added!");
    }

    static void enrollStudent() {
        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();

        System.out.print("Enter Course ID: ");
        int cid = sc.nextInt();

        Student s = students.get(sid);
        CourseImpl c = courses.get(cid);

        if (s == null || c == null) {
            System.out.println("Invalid IDs!");
            return;
        }

        enrollments.putIfAbsent(sid, new ArrayList<>());
        enrollments.get(sid).add(c);

        // Thread call
        new EnrollmentThread(s, c).start();
    }

    static void viewStudents() {
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    static void viewEnrollments() {
        for (int sid : enrollments.keySet()) {
            System.out.println("Student ID: " + sid);
            for (CourseImpl c : enrollments.get(sid)) {
                System.out.println("   " + c);
            }
        }
    }
}
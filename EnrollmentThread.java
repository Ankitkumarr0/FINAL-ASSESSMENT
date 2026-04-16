class EnrollmentThread extends Thread {
    Student student;
    CourseImpl course;

    EnrollmentThread(Student s, CourseImpl c) {
        this.student = s;
        this.course = c;
    }

    public void run() {
        System.out.println("Processing enrollment for " + student.name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(student.name + " enrolled in " + course.courseName);
    }
}
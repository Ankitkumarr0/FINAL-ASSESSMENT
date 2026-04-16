class CourseImpl implements Course {
    int courseId;
    String courseName;
    double fee;

    CourseImpl(int id, String name, double fee) throws InvalidFeeException {
        if (fee < 0) {
            throw new InvalidFeeException("Fee cannot be negative!");
        }
        this.courseId = id;
        this.courseName = name;
        this.fee = fee;
    }

    public double calculateFee() {
        return fee;
    }

    public String toString() {
        return courseId + " | " + courseName + " | " + fee;
    }
}
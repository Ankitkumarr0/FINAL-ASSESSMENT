class Student {
    int id;
    String name;
    String email;

    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return id + " | " + name + " | " + email;
    }
}
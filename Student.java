public class Student {
    private String studentNumber;
    private String lastName;
    private String firstName;
    private String bookTitle;

    // Constructor for Student class
    public Student(String studentNumber, String lastName, String firstName, String bookTitle) {
        this.studentNumber = studentNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.bookTitle = bookTitle;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
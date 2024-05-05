public class LibrarySystem {
    
    public static void main(String[] args) {
        // Student 1
        Student student1 = new Student("1357", "Don", "Ibarra", "Physics Book");

        // BookProcessor for Student 1
        BookProcessor manager1 = new BookProcessor(student1, new Booking());
        manager1.manageAssets();

        // Student 2
        Student student2 = new Student("2468", "Clara", "Maria", "Noli Me Tángere");

        // BookProcessor for Student 2
        BookProcessor manager2 = new BookProcessor(student2, new Journalist());
        manager2.manageAssets();
    }
}
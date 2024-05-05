public class Journalist implements BorrowBook{

    @Override
    public void borrow(String title) {
        System.out.println("Journal Borrowing: " + title);
    }

}
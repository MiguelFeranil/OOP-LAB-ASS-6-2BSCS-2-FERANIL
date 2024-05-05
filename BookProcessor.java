public class BookProcessor {
    private Student studentBook;
    private BorrowBook borrow;

    public BookProcessor(Student studentBook, BorrowBook borrowable) {
        this.studentBook = studentBook;
        this.borrow = borrow;
    }

    public void manageAssets () {
        borrow.borrow(studentBook.getBookTitle());
    }
}
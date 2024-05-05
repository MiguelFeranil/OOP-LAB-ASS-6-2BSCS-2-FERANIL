public class Booking implements BorrowBook {

    @Override
    public void borrow(String title) {
        System.out.println("Book Borrowing: " + title);
    }
    
}
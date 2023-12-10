public class Person {
    private String firstName;
    private String lastName;
    private int ID;
    private Book borrowedBook;
    private Book lastBorrowedBook;
    private Book currentBook;

    public Person(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public void display() {
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nID: " + ID);
        if (borrowedBook != null) {
            System.out.println("Current book: " + borrowedBook.getTitle());
        } else {
            System.out.println("Current book is empty ");
        }
        if (lastBorrowedBook != null) {
            System.out.println(" The  last book: " + lastBorrowedBook.getTitle());
        }
    }

    public Book getLastBorrowedBook() {
        return lastBorrowedBook;
    }

    public void setLastBorrowedBook(Book lastBorrowedBook) {
        this.lastBorrowedBook = lastBorrowedBook;
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(Book currentBook) {
        this.currentBook = currentBook;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

}

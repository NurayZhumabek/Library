public class Library {
    private Book[] books;
    private Person[] people;
    private String[] operationList;


    public Library(int size, int sizePeople) {
        this.books = new Book[size];
        this.people = new Student[sizePeople];
        this.operationList=new String[100];
    }

    public Library(Book[] books, Person[] people) {
        this.books = books;
        this.people = people;
        this.operationList =  new String[100];
    }

    public void lendBook(Person person, String bookTitle) {
        if (person.getBorrowedBook() != null) {
            return;
        }
        int index = searchBook(bookTitle);
        if (index != -1) {
            person.setBorrowedBook(books[index]);
            books[index] = null;

            addOperation(getRole(person)+" "+person.getLastName()+"has taking the book "+bookTitle);
        }

    }
    String getRole(Person person){
        String role="Person";
        if (person instanceof Student){
            return  "Student";}
       else if (person instanceof Teacher){
            return "Teacher";}
       return "Person";

    }
    public void acceptBook(Person person) {
        if (person.getBorrowedBook() == null) {
            return;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = person.getBorrowedBook();
                person.setBorrowedBook(null);
                person.setLastBorrowedBook(books[i]);
                addOperation(getRole(person)+" "+person.getLastName()+"has accept the book "+books[i].getTitle());
                break;
            }

        }
    }

    public void addBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                addOperation("Was added the book "+books[i].getTitle());
                break;
            }
        }
    }

    public void addStudent(Student student) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = student;
                addOperation("Was added the student "+people[i].getLastName());
                break;
            }
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
    public Person searchPerson(int id){
        for (int i = 0; i < people.length; i++) {
            if(people[i].getID()==id){
                return people[i];
            }
        }
        return null;
    }
    public void addOperation(String operation){
        for (int i = 0; i <operationList.length; i++) {
            if (operationList[i]==null){

                operationList[i]=operation;

            }

        }
    }

    public Book[] getBooks() {
        return books;
    }

    public String[] getOperationList() {
        return operationList;
    }

    public void setOperationList(String[] operationList) {
        this.operationList = operationList;
    }
}
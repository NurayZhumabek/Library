// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book[] book={
                new Book("Lev Tolstoy","War and Peace",1),
                new Book("Mark Tven","Hulliver",2),
                new Book("Gregory Petrov","Laplandya",3),
                new Book("Sayin Muratbekov","Zhabayi alma",4),
                new Book("Muhtar Ayezov","Abay joly",5)
        };
        Person[] people={
                new Person("Aydin","Eleuov",1),
                new Person("Alihan","Aidarov",2),
                new Student("Maxsim","Sergeyev",3,12345),
                new Student("Assel","Satzhan",4,12344),
                new Teacher("Saya","Alpysova",5,Subject.HISTORY),
                new Teacher("Sultan","Mukanov",6,Subject.CHEMISTRY)
        };
        Library library=new Library(book,people);
        library.searchPerson(2);
        library.searchBook("War and Peace");
        people[1].display();
    }
}
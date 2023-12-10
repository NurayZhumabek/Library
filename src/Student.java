public class Student  extends Person{
    int studentCardNumber;
    public Student(String firstName, String lastName, int ID,int studentCardNumber) {
        super(firstName, lastName, ID);
        this.studentCardNumber=studentCardNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student card number: "+studentCardNumber);
    }
}

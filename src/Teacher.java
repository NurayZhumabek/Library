public class Teacher extends Person {
    private Subject subject;
    public Teacher(String firstName, String lastName, int ID,Subject subject) {
        super(firstName, lastName, ID);
        this.subject=subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setStudent(String n, int r, double m) {
        this.name = n;
        this.rollNo = r;
        this.marks = m;
    }

    public void getStudent() {
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.marks);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student S = new Student();
        S.setStudent("ABC", 1, 55.7);
        S.getStudent();
    }
}

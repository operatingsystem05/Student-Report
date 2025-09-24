public class Student
{
    String name;
    int age, marks;

    public Student(String name, int age, int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }
}

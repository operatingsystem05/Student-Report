public class Main {
    public static void main(String[] args)
    {
        Student[] students =
                {
                        new Student("oumaima", 18, 76),
                        new Student("ihsan", 17, 90),
                        new Student("nour", 18, 45)
                };

                for (Student s : students)
                {
                    String status = s.isPassed() ? "Passed" : "Failed";
                    System.out.println("Student: " + s.name + ", age : " + s.age + ", mark: " + s.marks + " - " + status);
                }
    }
}
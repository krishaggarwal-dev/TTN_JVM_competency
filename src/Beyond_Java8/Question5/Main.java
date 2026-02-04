package Beyond_Java8.Question5;

record Student(String name, int id , int age){
    static int count=0;

    public Student{
        count++;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Krish", 101, 22);
        Student s2 = new Student("Sanyam", 102, 27);
        Student s3 = new Student("Pratham", 103, 24);

        System.out.println(s1.equals(s2));

        System.out.println("Total Object created = " + Student.count);


    }
}

package Class_Object;

public class Task1 {
    
    public static void main(String[] args) {
        Student std1 = new Student("Aditya",8.35);
        Student std2 = new Student("Varma",7.85);
        std1.study();
        std2.study();
        }
}
class Student{
    String name;
    double cgpa;

    Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    void study(){
        System.out.println(name + " is studying. CGPA:"+cgpa);
    }
}
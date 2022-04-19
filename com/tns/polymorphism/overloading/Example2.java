package overloading;

public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Brijesh");
        Student s2= new Student(2, "Brij", 20);

        s1.display();
        s2.display();

    }
}

class Student{
    int id, age;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    void display(){
        System.out.println(id+"   "+name+"   "+age);
    }
}

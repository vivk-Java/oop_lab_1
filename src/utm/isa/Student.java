package utm.isa;

public class Student {
    public String name;
    public int age;
    public float mark;

    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String toString() {
        return getClass().getName() + "[name=" + this.name +
                ",age=" + this.age +
                ",mark=" + this.mark + "]";
    }
}

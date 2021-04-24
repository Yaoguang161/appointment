package priv.text.homework;

/**
 * Created by Enzo Cotter on 2020/11/1.
 */

class Student {
    private String name;
    private double grade;
    private int id;

    public Student() {
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
public class xuesheng {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setId(001);
        stu1.setGrade(99);
        System.out.println("姓名："+stu1.getName());
        System.out.println("学号："+stu1.getId());
        System.out.println("成绩："+stu1.getGrade());

        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setId(002);
        stu2.setGrade(100);
        System.out.println("姓名："+stu2.getName());
        System.out.println("学号："+stu2.getId());
        System.out.println("成绩："+stu2.getGrade());

    }
}


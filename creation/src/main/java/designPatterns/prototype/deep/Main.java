package designPatterns.prototype.deep;


import designPatterns.prototype.shallow.School;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();

        School school = new School();
        school.setName("天津大学");

        s1.setSchool(school);

        Student s2 = (Student) s1.clone();
        s2.getSchool().setName("上海大学");

        System.out.println("s1:"+s1.getSchool().getName());
        System.out.println("s2:"+s2.getSchool().getName());
    }
}

package designPatterns.prototype.shallow;

import java.util.Date;
import java.util.List;

/**
 * 浅拷贝，主要实现Cloneable 接口
 * 特点：对引用数据类型进行引用传递般的拷贝
 */
public class Student implements Cloneable {

    private String name;

    private Date birthday;

    private List<String> fridends;

    private School school;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 方式一：浅拷贝
//        return super.clone();
        // 方式二：普通深拷贝(若成员变量是对象也要实现Cloneable接口)  缺点：List 这种jdk自带的类无法实现Cloeable接口，复杂类无法实现
        Student student = (Student) super.clone();
//        student.school = school.clone();
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getFridends() {
        return fridends;
    }

    public void setFridends(List<String> fridends) {
        this.fridends = fridends;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}

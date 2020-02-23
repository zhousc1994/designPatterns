package designPatterns.prototype.deep;

import designPatterns.prototype.shallow.School;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * 深拷贝：对基本数据类型进行值传递，对引用数据类型，创建一个新的对象，并复制其内容，此为深拷贝
 * 实现深拷贝例子：采用对象序列化的方式实现深拷贝
 */
public class Student implements Serializable {

    private String name;

    private Date birthday;

    private List<String> fridends;

    private School school;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 方式一：浅拷贝
//        return super.clone();
        // 方式二：普通深拷贝（若成员变量是对象也要实现Cloneable接口）  缺点：List 这种jdk自带的类无法实现Cloeable接口，复杂类无法实现
//        Student student = (designPatterns.prototype.shallow.Student) super.clone();
//        student.school = school.clone();

        // 方式三： 深拷贝(将对象写入流中，再读取出来)
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return  (Student)oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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


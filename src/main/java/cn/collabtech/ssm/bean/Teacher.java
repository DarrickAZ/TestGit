package cn.collabtech.ssm.bean;

import java.util.List;

/**
 * @Auther: Darrick
 * @Date: 2018/10/9 17:26
 * @Description:
 */
public class Teacher {

    private Integer id;

    private String name;

    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(Integer id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}

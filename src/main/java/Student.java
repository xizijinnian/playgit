import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ziyue
 * @Date: 2022/12/30
 * @Description: "记得写注释嗷，你可别让我逮住了 -子月"
 * @Description: "野百合绽放在黄昏的山巅"
 */
public class Student {
    private String name;
    private String sex;
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

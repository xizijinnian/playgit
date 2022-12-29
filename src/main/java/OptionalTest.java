import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ziyue
 * @Date: 2022/12/30
 * @Description: "记得写注释嗷，你可别让我逮住了 -子月"
 * @Description: "野百合绽放在黄昏的山巅"
 */
public class OptionalTest {
    public static void main(String[] args) {
        //Student student = new Student("zhangsan","men");
        Student student = null;
        Optional<Student> optionalStudent = Optional.ofNullable(Optional.ofNullable(student).orElseGet(() -> new Student("sas", "asd")));
        Student student1 = optionalStudent.orElseGet(() -> new Student("123","wwe"));
        System.out.println(student1);
        System.out.println(optionalStudent);
        Optional<String> optionalName = optionalStudent.map(Student::getName);
        optionalStudent.map(Student::getName).ifPresent(System.out::println);
        Boolean x = optionalStudent.map(Student::getName).isPresent();
        System.out.println(x);
        System.out.println(optionalName);
        //总结一下吧 省去了if 那么判断 无论是这个 还是其他的 技术 动手是检验真理的唯一标准
        //ofNullable 是比较推荐的  多点进去源码看一下
        // 注意ifPresent isPresent
        // 支持Lambda 大家可以进行对应的 先匿名内部类 再转换嘛 剩余语法慢慢熟悉 多看看提示
        // orElseGet 代表的是当接收到的对象为空的时候 赋予什么值 建议使用这个  这个类似于懒汉模式 减少程序开销

    }
}

package lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ziyue
 * @Date: 2022/12/25
 * @Description: "记得写注释嗷，你可别让我逮住了 -子月"
 * @Description: "野百合绽放在黄昏的山巅"
 */
public class HelloGrouping {
    public static void main(String[] args) {
        List<Emp> empList = Emp.generate();
//        Map<Boolean,List<Emp>> group = empList.stream()
//                .collect(Collectors.partitioningBy(x -> x.getSal() > 2000));
//        System.out.println(group);
//        System.out.println(group.get(true));
        Map<String,List<Emp>> group1 = empList.stream().collect(Collectors.groupingBy(Emp::getJob));
        System.out.println(group1);
    }
}

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ziyue
 * @Date: 2022/10/17
 * @Description: "记得写注释嗷，你可别让我逮住了 -子月"
 * @Description: "野百合绽放在黄昏的山巅"
 */
public class first {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
        first first = new first();
        first.facilitate();
        first.facilitate2();
    }
    public Integer facilitate(){
        Integer Sum = 0;
        for (int i = 0; i < 5; i++) {
            Sum+= i;
            System.out.println(Sum);
        }
        return Sum;
    }
    public Integer facilitate2(){
        Integer Sum2 = 0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }
        return Sum2;
    }
}

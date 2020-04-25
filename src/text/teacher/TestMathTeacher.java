package text.teacher;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 16:55
 */

public class TestMathTeacher {
    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher(1, "王挺", "男", 45, "数学", "初中毕业");
        System.out.println(mathTeacher);
        mathTeacher.startWork(8);
        mathTeacher.offWork(16);
        mathTeacher.teachProcedure();
    }
}

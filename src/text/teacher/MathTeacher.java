package text.teacher;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 16:41
 */

public class MathTeacher extends Teacher {
    public MathTeacher(int id, String name, String sex, int age, String education, String teacherTitile) {
        super(id, name, sex, age, education, teacherTitile);
    }
    //重写方法
    @Override
    public void teachProcedure() {
        System.out.println("教乘法口诀");
    }
}

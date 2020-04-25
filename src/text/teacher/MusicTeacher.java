package text.teacher;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 16:47
 */

public class MusicTeacher extends Teacher {
    public MusicTeacher(int id, String name, String sex, int age, String education, String teacherTitile) {
        super(id, name, sex, age, education, teacherTitile);
    }
    @Override
    public void teachProcedure(){
        System.out.println("教唱跳rap");
    }
}

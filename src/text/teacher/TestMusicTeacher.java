package text.teacher;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 16:56
 */

public class TestMusicTeacher {
    public static void main(String[] args) {
        Teacher MusicTeacher = new MusicTeacher(2, "张刚强", "女", 25, "音乐老师", "高中毕业");
        System.out.println(MusicTeacher);
        MusicTeacher.startWork(8);
        MusicTeacher.offWork(16);
        MusicTeacher.teachProcedure();
    }
}

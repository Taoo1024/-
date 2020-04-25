package text4_17;/*
 *
 * @Author: zt
 * @Date: 2020/4/17 09:59
 */

import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("www.");
        sbuffer.append("4399.");
        sbuffer.append("com");
//        sbuffer.reverse();
        sbuffer.delete(0, 4);
        sbuffer.insert(1, 555);
        System.out.println(sbuffer);
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
    }
}

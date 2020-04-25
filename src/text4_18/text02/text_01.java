package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/18 16:50
 */

import java.util.Scanner;

public class text_01 {
    public static void main(String[] args) {
        int username = 1;
        int passwd = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        int user = sc.nextInt();
        System.out.println("请输入密码:");
        int pwd = sc.nextInt();

        if(username==user && passwd==pwd){
            System.out.println("登录成功!");
        }else {
            System.out.println("登录失败...");
        }
    }
}

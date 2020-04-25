package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/19 14:27
 */

import java.util.Scanner;

public class text_07 {
    public static void main(String[] args) {
        while(true) {
            int[] b=new int[8];
            System.out.println("请输入十进制整数:");
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            System.out.print(a+"的二进制为：");
            for(int i=b.length-1;i>=0;i--) {
                b[i]=a%2;
                a=a/2;
            }
            for(int i=0;i<b.length;i++) {
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
}

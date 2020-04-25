package text.Shape2D;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:45
 */

import java.util.Scanner;

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入圆的半径：" );
        double r;
        r=scan.nextInt();
        Scanner x= new Scanner(System.in);
        System.out.print("请输入矩形长：" );
        double h;
        h=x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("请输入矩形宽：" );
        double w;
        w=y.nextInt();

        Cricle cricle1 = new Cricle(r);
        Rectangle rectangle1 = new Rectangle(h,w);
        cricle1.grith();
        cricle1.aera();
        rectangle1.grith();
        rectangle1.aera();
    }
}

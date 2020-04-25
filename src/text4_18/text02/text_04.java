package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/19 13:59
 */

import java.util.Arrays;
import java.util.Scanner;

public class text_04 {
    public static void main(String[] args) {
        double[] a =new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<a.length;i++){
            System.out.println("请第"+(i+1)+"位评委打分:");
            a[i]=sc.nextDouble();
        }
        Arrays.sort(a);
        double b = 0;
        for(int j = 1;j<a.length-1;j++){
            b += a[j];
        }
        double ave = b/3;
        System.out.println("选手的最终得分为："+ave);
    }
}

package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/19 14:08
 */

import java.util.Scanner;

public class text_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int num = sc.nextInt();
        int[] a =new int[num];
        for(int i = 0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"位值");
            int arr =sc.nextInt();
            a[i] = arr;
        }
        int temp = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(int m = 0;m<a.length;m++){
            System.out.println(a[m]);
        }
    }
}

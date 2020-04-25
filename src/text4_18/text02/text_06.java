package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/19 14:22
 */

public class text_06 {
    public static void main(String[] args) {
        int[] arr =new int[20];
        arr[0] = arr[1] = 1;
        for(int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1] +arr[i-2];
        }
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

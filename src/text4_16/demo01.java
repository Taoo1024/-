package text4_16;/*
 *
 * @Author: zt
 * @Date: 2020/4/16 11:25
 */

import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        int[] temp = new int[]{1,2,6,4,8,3,5,66};
        int[] newArr1 = Arrays.copyOf(temp, temp.length+4);
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 1, 6)));
        Arrays.parallelSort(temp);
        System.out.println(Arrays.toString(temp));
    }
}

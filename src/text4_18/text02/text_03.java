package text4_18.text02;/*
 *
 * @Author: zt
 * @Date: 2020/4/19 11:57
 */

public class text_03 {
    public static void main(String[] args) {
        int num = 0;
        int[] a = {1,2,0,4,0,6};

        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                num+=1;

            }
        }

        int[] b = new int[num];
        int j = 0 ;
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                b[j]=a[i];
                j++;
            }
        }
        for(int m = 0;m<b.length;m++){
            System.out.print(b[m]+" ");
        }
    }
}

package text4_18.text02;

import java.util.ArrayList;

; /*

 *
 * @Author: zt
 * @Date: 2020/4/20 08:57
 */

public class toto {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("abc");
        obj.add("def");
        obj.add("def");
        obj.add("ghi");
        obj.add("def");
        obj.add("hij");
        obj.add("jkol");
        System.out.println("当前的集合中的元素为：");
        for(int i=0;i<obj.size();i++) {
                System.out.print(obj.get(i)+" ");
            }
            System.out.println();
        int count=0;
        for(int i=0;i<obj.size();i++) {
                if(obj.get(i).equals("def")){
                    count++;
                }
        }
        System.out.println("def一共出现了"+count+"次");
        System.out.println("开始删除集合中的def字符串，请稍候...");
        for(int i=0;i<obj.size();i++) {
            if(obj.get(i).equals("def")){
                obj.remove(i);
                i-=1;//remove方法 会改变ArrayList的索引，需要重新扫描该位置的元素，以免漏掉
            }
        }
        System.out.println("当前的集合中的元素为：");
        for(int i=0;i<obj.size();i++) {
            System.out.print(obj.get(i)+" ");
        }
//        array.add(object);//添加一个元素
//        array.get(index);//取出集合中的元素，在get方法的参数中，写入索引。
//        array.size();//返回集合的长度，也就是存储元素的个数。
//        array.set(object);//设置一个元素
//        array.remove();//移除一个元素


    }



}



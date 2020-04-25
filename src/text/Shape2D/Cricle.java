package text.Shape2D;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:34
 */

public class Cricle implements Shape2D{
    double redius;
    public Cricle(double r){
        redius = r;
    }
    @Override
    public void grith(){
        double cg = 2*pi*redius;
        System.out.println("圆的周长是"+cg);
    };
    @Override
    public void aera(){
        double ca = pi*redius*redius;
        System.out.println("圆的面积是"+ca);
    };
}

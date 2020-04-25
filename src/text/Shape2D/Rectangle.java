package text.Shape2D;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:43
 */

public class Rectangle implements Shape2D {
    double height;
    double weight;
    public Rectangle(double h,double w){
        height = h;
        weight = w;
    }
    @Override
    public void grith(){
        double rg = 2*(height+weight);
        System.out.println("矩形的周长是"+rg);
    };
    @Override
    public void aera(){
        double ra = height*weight;
        System.out.println("矩形的面积是"+ra);
    };
}


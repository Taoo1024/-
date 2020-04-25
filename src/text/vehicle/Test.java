package text.vehicle;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 17:48
 */

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike moto = new Motorbike();
        car.run();
        car.wheelsNum();
        moto.run();
        moto.wheelsNum();
    }
}

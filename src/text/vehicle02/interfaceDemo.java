package text.vehicle02;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:17
 */

public class interfaceDemo {
    public static void main(String[] args) {
        Bike bick = new Bike();
        Bus bus = new Bus();
        bick.start();
        bick.stop();
        bus.start();
        bus.stop();
    }
}

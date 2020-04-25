package text.vehicle;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 17:30
 */

public abstract class Vehicle {
    public void run() {
        System.out.printf("Running");
    }
    abstract public void wheelsNum();
}

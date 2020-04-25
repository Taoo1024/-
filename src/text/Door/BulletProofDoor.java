package text.Door;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:29
 */

public class BulletProofDoor extends Door implements BulletSafe {
    @Override
    public void bulletProof(){
        System.out.println("防弹");
    }
}

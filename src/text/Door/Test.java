package text.Door;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:30
 */

public class Test {
    public static void main(String[] args) {
        FireProofDoor fd = new FireProofDoor();
        BulletProofDoor bd = new BulletProofDoor();
        fd.fireProof();
        bd.bulletProof();
    }
}

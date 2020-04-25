package text.Door;/*
 *
 * @Author: zt
 * @Date: 2020/4/15 19:24
 */

public class FireProofDoor extends Door implements FireSafe {
    @Override
    public void fireProof(){
        System.out.println("防火");
    }
}

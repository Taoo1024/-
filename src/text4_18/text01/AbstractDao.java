package text4_18.text01;/*
 *
 * @Author: zt
 * @Date: 2020/4/18 13:54
 */

public abstract class AbstractDao implements IDAO{
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void del() {
        System.out.println("删除");
    }

    @Override
    public void upd() {
        System.out.println("修改");
    }

    @Override
    public void sel() {
        System.out.println("查找");
    }
}

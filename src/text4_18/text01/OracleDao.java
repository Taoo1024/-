package text4_18.text01;/*
 *
 * @Author: zt
 * @Date: 2020/4/18 13:59
 */

public class OracleDao extends AbstractDao implements IDAO{
    @Override
    public void connect() {
        System.out.println("链接OracleDao数据库");
    }
}

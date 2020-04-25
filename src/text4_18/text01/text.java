package text4_18.text01;/*
 *
 * @Author: zt
 * @Date: 2020/4/18 14:00
 */

public class text {
    public static void main(String[] args) {
        MySqlDao mySqlDao = new MySqlDao();
        OracleDao oracleDao = new OracleDao();
        mySqlDao.connect();
        mySqlDao.add();
        mySqlDao.del();
        mySqlDao.upd();
        mySqlDao.sel();

    }
}

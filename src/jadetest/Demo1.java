package jadetest;
import com.db.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	static String sql = null;
	static String sql1 = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;
	static int result=0;

	public static void main(String[] args) {
		//sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(7,'S')";//SQL语句
		sql1="CREATE TABLE REGISTRATION1 " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
		db1 = new DBHelper(sql1);//创建DBHelper对象

		try {

			result = db1.pst.executeUpdate();//执行语句，得到结果集
			System.out.println(result);
			db1.close();//关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

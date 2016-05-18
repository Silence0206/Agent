package jadetest;
import com.db.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	static String sql = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;
	static int result=0;

	public static void main(String[] args) {
		sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(7,'S')";//SQL语句
		db1 = new DBHelper(sql);//创建DBHelper对象

		try {

			result = db1.pst.executeUpdate();//执行语句，得到结果集
			
			db1.close();//关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

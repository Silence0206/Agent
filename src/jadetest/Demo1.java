package jadetest;
import com.db.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	static String sql = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;

	public static void main(String[] args) {
		sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(6,'S')";//SQL语句
		db1 = new DBHelper(sql);//创建DBHelper对象

		try {
			ret = db1.pst.executeQuery();//执行语句，得到结果集
			
				
				
				
			//显示数据
			ret.close();
			db1.close();//关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

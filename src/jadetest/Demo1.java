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
		sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(7,'S')";//SQL���
		db1 = new DBHelper(sql);//����DBHelper����

		try {

			result = db1.pst.executeUpdate();//ִ����䣬�õ������
			
			db1.close();//�ر�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package jadetest;
import com.db.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	static String sql = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;

	public static void main(String[] args) {
		sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(6,'S')";//SQL���
		db1 = new DBHelper(sql);//����DBHelper����

		try {
			ret = db1.pst.executeQuery();//ִ����䣬�õ������
			
				
				
				
			//��ʾ����
			ret.close();
			db1.close();//�ر�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

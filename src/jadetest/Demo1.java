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
		//sql = " insert into studenttype (StudentTypeId,StudentTypeName) values(7,'S')";//SQL���
		sql1="CREATE TABLE REGISTRATION1 " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
		db1 = new DBHelper(sql1);//����DBHelper����

		try {

			result = db1.pst.executeUpdate();//ִ����䣬�õ������
			System.out.println(result);
			db1.close();//�ر�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

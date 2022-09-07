package Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DBManager {

	Connection con;
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public DBManager(String dbName, String user, String password) throws ClassNotFoundException, SQLException {
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName,user,password);		
	}
	
	public List<String> getAllData(String tableName) throws SQLException{
		Statement stmt=con.createStatement();
		List<String> list=new ArrayList<>();
		ResultSet rs=stmt.executeQuery("select * from "+tableName);
		while(rs.next())
		{
			ResultSetMetaData rsmd=rs.getMetaData();
			int count=rsmd.getColumnCount();
			String str="";
			for(int i=1;i<=count;i++)
				str=str+" "+rs.getString(i);
			list.add(str.trim());
		}
		rs.close();
		stmt.close();
		return list;
	}
	
	public void insert(String tableName,HashMap<String,String> map) throws SQLException {
		String query="Insert into "+tableName;
		String cols="";
		String vals="";
		for(Map.Entry<String,String> entry:map.entrySet())
		{
			String val=entry.getValue();
			if(val.charAt(0)>=48 && val.charAt(0)<=57)
				vals=vals+entry.getValue()+",";
			else
				vals=vals+"'"+val+"',";
			cols=cols+entry.getKey()+",";
		}
		cols=cols.substring(0, cols.length()-1);
		vals=vals.substring(0,vals.length()-1);
		query=query+"("+cols+") values ("+vals+")";
		PreparedStatement pr=con.prepareStatement(query);
		 pr.executeUpdate();
		pr.close(); 
		
	}

}

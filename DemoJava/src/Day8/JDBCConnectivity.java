package Day8;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JDBCConnectivity {
	DBManager dbObject;
	public void getConnectivity(String dbName,String user,String password)
	{
		try {
			dbObject=new DBManager(dbName,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public List<String> getAllData(String tableName) throws SQLException
	{
		List<String> list;
		list=dbObject.getAllData(tableName);
		return list;
	}
	
	public void insert(String tableName,HashMap<String,String> map) throws SQLException {
		
		dbObject.insert(tableName, map);
	}
	
	public static void main(String[] args) throws SQLException {
		JDBCConnectivity jdbc=new JDBCConnectivity();
		jdbc.getConnectivity("employee_db","root","root");
		
		//Fetching Data
		List<String> list=jdbc.getAllData("employee");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//Inserting Data
		HashMap<String,String> map=new HashMap<>();
		map.put("idEmployee","1010");
		map.put("firstName", "Ravana");
		map.put("lastName","King");
		map.put("salary","45600");
	
//		map.put("roll_no","1010");
//		map.put("stud_name","krish");
//		jdbc.insert("student",map);
	}
}

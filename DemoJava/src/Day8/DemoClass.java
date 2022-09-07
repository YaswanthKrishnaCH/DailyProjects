package Day8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		
		//Class.forName==Loads the class and then implements the static block of the Driver class which
		//registers the driver and Driver Manager communicates with vendor specific drivers that perform 
		//the real connection with the database

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
			
			try {
			Statement stmt = con.createStatement();
			
			DemoClass.getAllEmployees(stmt);
			
			DemoClass.getEmployee(con,1001);
			
			DemoClass.insertEmployee(con, 1005,"Manjesh","Mata", 125678);
			
			DemoClass.updateEmployeeName(con, 1005, "Ramesh");
			
			DemoClass.deleteEmployee(con, 1005);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				con.close();
			}
		
		
	}
	
	
	public static void getAllEmployees(Statement stmt) throws Exception
	{
		//Executing the query
		ResultSet rs=stmt.executeQuery("select * from employee");
		System.out.println("-------EMPLOYEES-------");
		while(rs.next())
		{
			System.out.println("ID :"+rs.getInt(1)+"  FirstName: "+rs.getString(2)+"  LastName: "+rs.getString(3)+" Salary:"+rs.getInt(4));
		}
		rs.close();
	}
	
	public static void getEmployee(Connection con,Integer id) throws Exception
	{
		PreparedStatement stmt=con.prepareStatement("select * from employee where idEmployee=?");
		stmt.setInt(1, id);
		//Executing the query
		ResultSet rs=stmt.executeQuery();
		if(rs.next())
		{
		System.out.println("-------EMPLOYEE WITH ID: "+id+"--------");
		System.out.println("ID :"+rs.getInt(1)+"  FirstName: "+rs.getString(2)+"  LastName: "+rs.getString(3)+" Salary:"+rs.getInt(4));
		}
		else
			System.out.println("No employees with the given ID");
		rs.close();
	}
	
	public static void insertEmployee(Connection con,Integer idEmployee,String firstName,String lastName,Integer salary) throws Exception
	{
		PreparedStatement pr=con.prepareStatement("Insert into employee values(?,?,?,?)");
		pr.setInt(1,idEmployee );
		pr.setString(2, firstName);
		pr.setString(3, lastName);
		pr.setInt(4,salary);
		 pr.executeUpdate();
		 System.out.println("Inserted Employee with employee_id: "+idEmployee);
		getAllEmployees(pr);
		pr.close(); 
		
	}
	
	public static void updateEmployeeName(Connection con,Integer id,String name) throws Exception
	{
		PreparedStatement pr=con.prepareStatement("Update employee set firstName=? where idEmployee=?");
		pr.setString(1, name);
		pr.setInt(2,id);
		int count=pr.executeUpdate();
		if(count>=1)
		{
		System.out.println("Updated Employee of ID: "+id+" with Name: "+name);
		getAllEmployees(pr);
		}
		else
			System.out.println("Cannot find employee with the given id");
		pr.close();
		}
	
	public static void deleteEmployee(Connection con,Integer id) throws Exception
	{
		PreparedStatement pr=con.prepareStatement("delete from employee where idEmployee=?");
		pr.setInt(1,id);
		int count=pr.executeUpdate();
		if(count>=1)
			System.out.println("Deleted Employee with ID: "+id);
		else
			System.out.println("Cannot find employee with the given id");
		getAllEmployees(pr);
		pr.close();
	}
}
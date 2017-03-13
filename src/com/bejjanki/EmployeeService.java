/**
 * 
 */
package com.bejjanki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Satheesh
 *
 */
public class EmployeeService {

	Connection con;
	Statement st;
	ResultSet rs;
	String status;
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bejjanki");
		st=con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	public String registration(String eid, String ename, String eemail, String emobile){
		try {
			rs=st.executeQuery("select *from employee2 where eid='"+eid+"'");
			boolean b=rs.next();
			if(b){
				status="existed";
			}else{
				st.executeUpdate("insert into employee2 values('"+eid+"', '"+ename+"','"+eemail+"','"+emobile+"')");
			status="success";
			}
			
			
		} catch (Exception e) {
		e.printStackTrace();
		status="failure";
		}
		
		return status;
	}

}

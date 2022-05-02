package ass_1;

import java.util.*;
import java.lang.*;
import java.sql.*;

public class Assignment1 {

	public static void main(String[] args) throws Exception {

		//JDBC
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harman_db","root","");
		Statement st = con.createStatement();

		Scanner scan = new Scanner(System.in);
		System.out.println("Select one option :");
		System.out.println("1. Insert a Record" + "\n" + "2. Delete a Record" + "\n" + "3. Search a Record");

		int option = scan.nextInt();

		switch(option) {
		case 1:
			
			//get the values
			System.out.print("Enter the PersonID:");
			int pId = scan.nextInt();
			System.out.print("Enter the FirstName:");
			String fName = scan.next();
			System.out.print("Enter the LastName:");
			String lName = scan.next();
			System.out.print("Enter the City:");
			String city = scan.next();
			System.out.print("Enter the Address:");
			String address = scan.next();
			
			//create the query
			String query = "INSERT INTO persons VALUES ("+pId+","+"'"+lName+"'"+","+"'"+fName+"'"+","+"'"+address+"'"+","+"'"+city+"'"+");";
			//execute the query
			try {
				st.executeUpdate(query);
				System.out.println("Added to the Table");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
			
		case 2:
			
			System.out.println("Enter the personID");
			int pID = scan.nextInt();

			String query2 = "DELETE FROM persons WHERE PersonId ="+pID;
			try {
				st.execute(query2);
				System.out.println("Deleted from the table");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case 3:
			System.out.println("Enter the personID");
			
			int PID = scan.nextInt();
			boolean valid = false;
			String query3 = "SELECT `PersonID`, `LastName`, `FirstName`, `Address`, `City` FROM `persons` WHERE PersonID ="+PID;
			try {
				ResultSet rs = st.executeQuery(query3);
				rs.next();
				System.out.println(rs.getInt("PersonID")+" "+ rs.getString("FirstName") + " " + rs.getString("LastName")+" "+ rs.getString("City")+" "+rs.getString("Address"));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Invalid option Selected");
			break;

		}

	}

}
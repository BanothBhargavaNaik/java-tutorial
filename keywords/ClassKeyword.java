/* Here is an example of Class keyword which is mainly used in connection of jdbc */
//For more examples of Class keyword look in jdbc section
// Here is a sample code which uses the Class keyword.

class ClassKeyword 
{
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.11.32.7:1521:orcl", "student","student");
		}
		catch(SQLException sqel)
		{
		 sqel.printStackTrace();
		}
					
}

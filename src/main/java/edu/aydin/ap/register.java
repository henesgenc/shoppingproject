package edu.aydin.ap;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection connect = null;
		try {
<<<<<<< HEAD
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&useSSL=false","root","2367854");
=======
			String sqluser = "root";
			String sqlpassword = "2brdk0La";
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&useSSL=false",sqluser,sqlpassword);
>>>>>>> 9f2faf3f93079dbb1b211557c0e35ef84733329d
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + e1.getMessage());
		    System.out.println("SQLState: " + e1.getSQLState());
		    System.out.println("VendorError: " + e1.getErrorCode());
		}
		try {
		Statement statement = connect.createStatement();
		String username = request.getParameter("username");
		String user_password = request.getParameter("user_password");
		String user_name = request.getParameter("user_name");
		String user_surname = request.getParameter("user_surname");
		String user_birthdate = request.getParameter("user_birthdate");
<<<<<<< HEAD
<<<<<<< HEAD
		String controlquery = "SELECT username FROM shooping.users";
		/*ResultSet rs = statement.executeQuery(controlquery);
=======
		String controlquery = "SELECT username FROM shopping.users";
		ResultSet rs = statement.executeQuery(controlquery);
>>>>>>> 9f2faf3f93079dbb1b211557c0e35ef84733329d
		while(rs.next()) {
			String un = rs.getString("username");
			if(un.equals(username)) {
				htn = true;
			}
		}
<<<<<<< HEAD
		if(htn) {*/
			//error massage.
		//}else {
		String query = "INSERT INTO `shopping`.`users` (`username`, `user_password`, `user_name`, `user_surname`, `user_birthdate`) VALUES ('"+ username +"', '"+ user_password +"', '"+ user_name +"', '"+ user_surname +"', '"+ user_birthdate +"');\r\n";
		statement.executeUpdate(query);
		//statement.executeUpdate("INSERT INTO shopping.users VALUES(2,"+request.getParameter("username").toString()+","+request.getParameter("user_password").toString()+","+request.getParameter("user_surname").toString()+","+request.getParameter("user_birthdate").toString()+")");
=======
		if(htn) {
			request.getServletContext().getRequestDispatcher("/register.jsp").
			forward(request, response);
		}else {
		String query = "INSERT INTO `shopping`.`users` (`username`, `user_password`, `user_name`, `user_surname`, `user_birthdate`) VALUES "
				+ "('"+ username +"', '"+ user_password +"', '"+ user_name +"', '"+ user_surname +"', '"+ user_birthdate +"');\r\n";
		statement.executeUpdate(query);
>>>>>>> 9f2faf3f93079dbb1b211557c0e35ef84733329d
		request.getServletContext().getRequestDispatcher("/registersuccessfully.jsp").
=======
		String query = "INSERT INTO `shopping`.`users` (`username`, `user_password`, `user_name`, `user_surname`, `user_birthdate`) VALUES ('"+ username +"', '"+ user_password +"', '"+ user_name +"', '"+ user_surname +"', '"+ user_birthdate +"');\r\n";
		statement.executeUpdate(query);
		//statement.executeUpdate("INSERT INTO shopping.users VALUES(2,"+request.getParameter("username").toString()+","+request.getParameter("user_password").toString()+","+request.getParameter("user_surname").toString()+","+request.getParameter("user_birthdate").toString()+")");
		request.getServletContext().getRequestDispatcher("/index.jsp").
>>>>>>> parent of 3062bb2... register-username control
		forward(request, response);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

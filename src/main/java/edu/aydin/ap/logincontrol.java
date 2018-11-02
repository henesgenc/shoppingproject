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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logincontrol
 */
public class logincontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws ClassNotFoundException 
     * @throws SQLException 
     * @see HttpServlet#HttpServlet()
     */
    public logincontrol() {
        super();
			/**/
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		HttpSession session=request.getSession(); 
		System.out.println(username);
		String password = request.getParameter("user_password"); 
		boolean status=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection connect = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&useSSL=false","root","2367854");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + e1.getMessage());
		    System.out.println("SQLState: " + e1.getSQLState());
		    System.out.println("VendorError: " + e1.getErrorCode());
		}
			try {
				Statement statement = connect.createStatement();
				String query = "SELECT username,user_password FROM shopping.users";
				ResultSet rs = statement.executeQuery(query);
				while(rs.next()) {
					String un = rs.getString("username");
					System.out.println(un);
					if(username.equals(un)) {
						status=true;
						String pass = rs.getString("user_password");
						if(password.equals(pass)) {
					        session.setAttribute("username",username); 
					        request.getServletContext().getRequestDispatcher("/index.jsp").
							forward(request, response);
					        System.out.println(session.getAttribute("username"));
					        System.out.println("Successed");
						}
						else
							System.out.println("Your password is wrong.");
					}
				}
				if(!status)
					System.out.println("Username Not Found");
					
			}
			catch(SQLException e) {
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

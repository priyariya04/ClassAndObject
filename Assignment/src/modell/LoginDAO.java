package modell;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import daoImpl.Login;

public class LoginDAO extends ConnectionManager implements Login{
	User user = new User();
	public List<User> displayAllUsers() {
		//String username1 = " ";
		// TODO Auto-generated method stub
		//User user = new User();
		
		
		String sql = "Select * from users where user_name = ";
		List<User> list = new LinkedList<User>();
		try {
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User user = new User();
				user.setFirstname(rs.getString("first_name"));
				user.setLastname(rs.getString("last_name"));
				user.setUsername(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));
				list.add(user);
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

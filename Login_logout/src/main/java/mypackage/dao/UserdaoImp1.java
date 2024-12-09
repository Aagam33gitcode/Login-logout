package mypackage.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mypackage.util.DBUtil;



public class UserdaoImp1 implements UserDao {
	@Override
	public boolean isvalidUser(String username, String password) {
		String queryString="select * from data_entry1 where username=? and password=?";
		try(Connection connection=DBUtil.getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(queryString)) {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("Query run done");
			return resultSet.next();

			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		return false;
		

}}
@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String querString="insert into data_entry1(username,gmail,password)values(?,?,?)";
		try(Connection connection=DBUtil.getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(querString)) {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			int rows=preparedStatement.executeUpdate();
			System.out.println("user added");
			return rows>0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}}





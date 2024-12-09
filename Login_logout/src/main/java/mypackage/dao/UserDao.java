package mypackage.dao;



public interface UserDao {
 

boolean isvalidUser(String username, String password);

public static boolean isValidUser(String username, String password) {
	
	return false;
}

boolean addUser(User user);







}

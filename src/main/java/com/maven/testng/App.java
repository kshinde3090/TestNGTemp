package com.maven.testng;

/**
 * Hello world!
 *
 */
public class App 
{
	String dbUsername="kishor";
	String dbPassword="kishor12";
	public String authonticateUser(String username,String password)
	{
		if(username==null){
			return AppConstant.NULL_USERNAME;
		}
		else if(password==null){
			return AppConstant.NULL_PASSWORD;
		}
		else if(username.equals("")){
			return AppConstant.EMPTY_USERNAME;
		}
		else if(password.equals("")){
			return AppConstant.EMPTY_PASSWORD;
		}
		
		else if(dbUsername.equals(username)&&dbPassword.equals(password)){
			return AppConstant.LOGIN_SUCCESSFULL;
		}
		return AppConstant.INVALID_USERNAME_AND_PASSWORD;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

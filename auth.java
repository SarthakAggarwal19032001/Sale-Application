/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1_2;

import java.sql.*;

/**
 *
 * @author hp
 */
public class auth {
    
    void authn(String user, String pass){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ass1_2?characterEncoding=latin1","root","19032001");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select *from owner where username='"+user+"' AND password='"+pass+"'");
        if(rs.next())
			{
				if(rs.getString(1).equals(user) && rs.getString(2).equals(pass))
				{
					System.out.println("Validated");
                                        menu m=new menu();
                                        m.choose();
				}
			}
			else
			{
				System.out.println("Wrong ID or password");
			}

           con.close();
        }
        
    catch(Exception e){
    System.out.println(e);
}}
}

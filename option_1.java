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
public class option_1 {
    void profit(int d){
        try{
            double profit=0;
            double s=0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ass1_2?characterEncoding=latin1","root","19032001");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select *from sale");
        while(rs.next())
        {
			
                            s=rs.getDouble(2);
                            if(s>5000 && s<10000)
                                profit=(s*.10)*d;
                            else if(s>1000 && s<15000)
                                profit=(s*.15)*d;
                            else if(s>15000 && s<20000)
                                profit=(s*.20)*d;
                            System.out.println("Profit Earned in "+d+" is "+profit );
                            //con.close();
        }
        con.close();
        }
    catch(Exception e){
    System.out.println(e);
}}
}



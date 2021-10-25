/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1_2;
import java.sql.*;
import java.util.*;

/**
 *
 * @author hp
 */
public class option_2 {
   
        HashMap<String, Integer> map;
	public option_2()
	{
		map = new HashMap<String,Integer>();
		map.put("jan",31);
		map.put("feb", 28);
		map.put("mar", 31);
		map.put("apr", 30);
		map.put("may", 31);
		map.put("jun", 30);
		map.put("jul", 31);
		map.put("aug", 31);
		map.put("sep", 30);
		map.put("oct", 31);
		map.put("nov", 30);
		map.put("dec", 31);
	}
         void profit(String month){
             double s=0;
             String t;
             double profit=0;
                  int d=0;
                  d=map.get(month);
                  try{
                      Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ass1_2?characterEncoding=latin1","root","19032001");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select *from sale");
        
         while(rs.next()){
			
                            s=rs.getDouble(2);
                            t=rs.getString(1);
                            if(s>5000 && s<10000)
                                profit=(s*.10)*d;
                            else if(s>1000 && s<15000)
                                profit=(s*.15)*d;
                            else if(s>15000 && s<20000)
                                profit=(s*.20)*d;
                            System.out.println("Profit Earned in "+month+" for item "+t+" "+profit);
                            //con.close();
                  }
         con.close();
                  }
                  catch(Exception e){
    System.out.println(e);
}}
                  
    }


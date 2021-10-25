/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1_2;
import java.util.*;

/**
 *
 * @author hp
 */
public class menu {
    void choose(){
        
    
    System.out.println("Choose any option \n");
    System.out.println("1: View Sale  2:Sale of the Month  3:Exit");
    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();
    
    switch(opt){
        case 1:
        {
            System.out.println("Enter Number Of days");
            int days=sc.nextInt();
            option_1 opt1=new option_1();
           opt1.profit(days);
            break;
        }
        case 2:
        {
            System.out.println("Enter Month");
            String mon=sc.next();
            option_2 opt2=new option_2();
            opt2.profit(mon);
            
            break;
        }
        case 3:
        {
            System.out.println("Your are successfully exitied");
            break;
            
        }
        default:{
            System.out.println("Wrong Option");
            
        }
    }
}}

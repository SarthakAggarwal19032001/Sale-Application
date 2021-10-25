/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a1_2;
import java.util.*;

public class A1_2 {

    
    public static void main(String[] args) {
        System.out.println("Enter Username and Password");
        Scanner sc=new Scanner(System.in);
        String Username=sc.next();
        String pass=sc.next();
        
        auth a=new auth();
        a.authn(Username,pass);
    }
    
}

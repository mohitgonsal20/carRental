/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohit
 */
public class UserDAO extends BaseDAO {
     Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;

    public boolean createUser(User u) {
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into HR.USER1 (FIRSTNAME, LASTNAME, U_USERNAME, U_PASSWD) values(?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,u.getFirstName());
            preparedStatement.setString(2,u.getLastName());
            preparedStatement.setString(3,u.getUserName());
            preparedStatement.setString(4,u.getPassWord());
           
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("insertion failed");
                    return false;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
         return false;
        
    }

    

    public boolean checkLogin(User a) {
       try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.USER1 where U_USERNAME=? AND U_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getUserName());
                
                preparedStatement.setString(2,a.getPassWord());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

    public User setData(User a) {
        User c = new User();
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select FIRSTNAME,LASTNAME from HR.USER1 where U_USERNAME=? AND U_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getUserName());
                
                preparedStatement.setString(2,a.getPassWord());
            
                rs=preparedStatement.executeQuery();
                
                
                c.setUserName(a.getUserName());
                c.setPassWord(a.getPassWord());
                
                rs.next();
               
                // c.setAdminId(rs.getInt("A_ID"));
                c.setFirstName(rs.getString("FIRSTNAME"));
                c.setLastName(rs.getString("LASTNAME"));
                
            
                rs.close();
             
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       return c;
    }
/*
    public boolean update(User u) {
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "UPDATE HR.USER  set Status=? where digiid=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,u.getStatus());
                
                preparedStatement.setInt(2,u.getDigiid());
            
               int count =preparedStatement.executeUpdate();
                if(count>0)
                {
                    System.out.println("Successfully Updated");
                    return true;
                }else{
                    System.out.println("Update failed");
                    return false;
                }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }

    public boolean checkPending() {
        
        String sql="select * from HR.user where Status = 'Pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   
                return true;
                
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        return false;
    }


    
    */
    
}

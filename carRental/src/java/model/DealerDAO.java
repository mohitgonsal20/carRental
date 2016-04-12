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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohit
 */
public class DealerDAO extends BaseDAO {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
    
    public boolean createDealer(Dealer d) {
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into HR.DEALER (DNAME, D_USERNAME, D_PASSWD) values(?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,d.getDealerName());
            preparedStatement.setString(2,d.getDealerUserName());
            preparedStatement.setString(3,d.getDealerPassWord());
            
           
        
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

    
    
    public boolean checkLogin(Dealer a) {
       try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.DEALER where D_USERNAME=? AND D_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getDealerUserName());
                
                preparedStatement.setString(2,a.getDealerPassWord());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

    public Dealer setData(Dealer a) {
        Dealer c = new Dealer();
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select DNAME from HR.DEALER where D_USERNAME=? AND D_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getDealerUserName());
                
                preparedStatement.setString(2,a.getDealerPassWord());
            
                rs=preparedStatement.executeQuery();
                
                
                c.setDealerUserName(a.getDealerUserName());
                c.setDealerPassWord(a.getDealerPassWord());
                
                rs.next();
               
                // c.setAdminId(rs.getInt("A_ID"));
                c.setDealerName(rs.getString("DNAME"));                
            
                rs.close();
             
                
        } catch (SQLException ex) {
            Logger.getLogger(DealerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       return c;
    }
    
}

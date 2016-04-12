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
public class ManageDAO extends BaseDAO {
    
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;

    public void enter(Car c, User u, String s1, String s2, String s3) {
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into HR.MANAGE (BUSER, BDEALER, MODEL, CNAME, STATUS, PLACE, BANKNAME, ACCNO, TXNO) values(?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,u.getFirstName());
            preparedStatement.setString(2,c.getOwner());
            preparedStatement.setString(3,c.getModel());
            preparedStatement.setString(4,c.getcName());
            preparedStatement.setString(5,"pending");
            preparedStatement.setString(6,"");
            preparedStatement.setString(7,s1);
            preparedStatement.setString(8,s2);
            preparedStatement.setString(9,s3);
           
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                  
                }else{
                    System.out.println("insertion failed");
                    
                }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
        
    }

    public boolean checkPendingOffer(Dealer d) {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.MANAGE where BDEALER=? and STATUS='pending'";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,d.getDealerName());
                
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

    public List<Manage> findPendingOffer(Dealer d) {
        
        ArrayList<Manage> addlist=new ArrayList<Manage>();
        
        String sql="select * from HR.MANAGE where BDEALER=? and STATUS='pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
            
             preparedStatement.setString(1,d.getDealerName());
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   Manage m  = new Manage();
                System.out.println("testMV123");
                
                m.setbUser(rs.getString(1));
                m.setbDealer(rs.getString(2));
                m.setModel(rs.getString(3));
                m.setcName(rs.getString(4));
                m.setStatus(rs.getString(5));
                m.setPlace(rs.getString(6));
                m.setBankName(rs.getString(7));
                m.setAccNo(rs.getString(8));
                m.setTxno(rs.getString(9));
                
                addlist.add(m);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        
    }

    public boolean update(String id, String status, String place) {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "UPDATE HR.MANAGE  set STATUS=?, PLACE=? where MODEL=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,status);
                
                preparedStatement.setString(2,place);
                
                 preparedStatement.setString(3,id);
            
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
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
        
    }

    public boolean checkRecord(String s) {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.MANAGE where BUSER=? ";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,s);
                
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
        
    }

    public Manage checkRecord2(String s) {
        
        Manage m  = new Manage();
        String sql="select * from HR.MANAGE where BUSER=?";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
            
             preparedStatement.setString(1,s);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   
                System.out.println("testMV123");
                
                m.setbUser(rs.getString(1));
                m.setbDealer(rs.getString(2));
                m.setModel(rs.getString(3));
                m.setcName(rs.getString(4));
                m.setStatus(rs.getString(5));
                m.setPlace(rs.getString(6));
                m.setBankName(rs.getString(7));
                m.setAccNo(rs.getString(8));
                m.setTxno(rs.getString(9));
                
                return m;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
        
    }
    
    
    
}

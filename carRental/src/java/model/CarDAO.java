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
public class CarDAO extends BaseDAO {
    
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;

    public boolean addCar(Car c) {
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into HR.CAR (CNAME, MODEL, TYPE, OWNER, STATUS, T2 ) values(?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,c.getcName());
            preparedStatement.setString(2,c.getModel());
            preparedStatement.setString(3,c.getcType());
            preparedStatement.setString(4,c.getOwner());
            preparedStatement.setString(5,c.getStatus());
            preparedStatement.setString(6,c.getT2());
           
        
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
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
         return false;
        
        
    }

    public boolean checkPending() {
        
        String sql="select * from HR.CAR where Status = 'Pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        return false;
        
        
    }

    public List<Car> findPendingCars() {
        
        
        ArrayList<Car> addlist=new ArrayList<Car>();
        
        String sql="select * from HR.CAR where Status = 'Pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   Car c  = new Car();
                System.out.println("test");
                
                c.setcName(rs.getString(1));
                c.setModel(rs.getString(2));
                c.setcType(rs.getString(3));
                c.setOwner(rs.getString(4));
                c.setStatus(rs.getString(5));
                c.setT2(rs.getString(6));
                
                
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        
        
        
        
    }

    public boolean update(Car c) {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "UPDATE HR.CAR  set STATUS=? where MODEL=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,c.getStatus());
                
                preparedStatement.setString(2,c.getModel());
            
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
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }
    
    
    

    public List<Car> findValidCars() {
    
        ArrayList<Car> addlist=new ArrayList<Car>();
        
        String sql="select * from HR.CAR where Status = 'approved'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   Car c  = new Car();
                System.out.println("testMV");
                
                c.setcName(rs.getString(1));
                c.setModel(rs.getString(2));
                c.setcType(rs.getString(3));
                c.setOwner(rs.getString(4));
                c.setStatus(rs.getString(5));
                c.setT2(rs.getString(6));
                
                
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        
        
        
    }

    
    
    
    public boolean checkValidCars() {
        
        String sql="select * from HR.CAR where Status = 'approved'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        return false;
       
    }

    public Car fill(String mod) {
        
        Car c  = new Car();
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.CAR where MODEL=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,mod);
                
                rs=preparedStatement.executeQuery();
                System.out.println("testMVG");
            while(rs.next())
            {   
                System.out.println("testMV");
                
                c.setcName(rs.getString(1));
                c.setModel(rs.getString(2));
                c.setcType(rs.getString(3));
                c.setOwner(rs.getString(4));
                c.setStatus(rs.getString(5));
                c.setT2(rs.getString(6));
                
                
            }
               
            
          return c;      
            
               
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return c;
        
    }
    
    
    
}

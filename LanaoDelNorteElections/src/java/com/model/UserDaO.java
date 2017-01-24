/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gokspoweroffour
 */
public class UserDaO {
    public boolean login(User oneUser){
          boolean successful = false;
          try {
            DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
            Connection conn = myFactory.getConnection();
            String sql = "select * from users where username = ? and password = ?";
            PreparedStatement pstmt =
                   conn.prepareStatement(sql);
            pstmt.setString(1, oneUser.getUsername());
            pstmt.setString(2, oneUser.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                successful = true;
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return successful;
    }
    
    public boolean signup(User oneUser){
        boolean successful=false;
        int rows = 0;
        DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
        Connection conn = myFactory.getConnection();
        try {  
          String sql = "insert into `users` (username, password) values (?,?)";
          PreparedStatement pstmt =
                  conn.prepareStatement(sql);
          pstmt.setString(1, oneUser.getUsername());
          pstmt.setString(2, oneUser.getPassword());
          rows = pstmt.executeUpdate();
          successful=true;
          conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return successful;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author gokspoweroffour
 */
import com.entity.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class ResultDaO {
    public ArrayList<Result> returnAll(){
        ArrayList<Result> result = new ArrayList<Result>();
        DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
        Connection conn = myFactory.getConnection();
        try {
            conn.setAutoCommit(false);
            String sql = "select * from `electionresults`;";
            PreparedStatement pstmt =
                   conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            Result resultEntry;
            while(rs.next()){
                resultEntry = new Result();
                resultEntry.setCity_or_municipality(rs.getString("city_or_municipality"));
                resultEntry.setPosition(rs.getString("position"));
                resultEntry.setName(rs.getString("name"));
                resultEntry.setNickname(rs.getString("nickname"));
                resultEntry.setParty_affiliation(rs.getString("party_affiliation"));
                resultEntry.setVotes_obtained(rs.getInt("votes_obtained"));
                result.add(resultEntry);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultDaO.class.getName()).log(Level.SEVERE, null, ex);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(ResultDaO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        finally{
            if (conn != null)
            {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ResultDaO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        return result;
    }
}

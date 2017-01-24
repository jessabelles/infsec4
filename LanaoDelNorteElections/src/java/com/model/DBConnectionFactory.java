/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.sql.Connection;

/**
 *
 * @author Garfield
 */
public abstract class DBConnectionFactory {
       private String username="jbellz";
       private String password="il0vey0u2";
       private String url="jdbc:mysql://localhost:3306/lanaodelnorte";
       private String driverName="com.mysql.jdbc.Driver";

       public static DBConnectionFactory getInstance(){
           return new DBConnectionFactoryImpl();
       }
       public abstract Connection getConnection();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
}

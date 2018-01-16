/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBCConn;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author choirul.huda
 */
public class MyConn {
    private String query;
    private String url;
    private String username;
    private String password;
    Connection conn;
    Statement st;
    ResultSet rs;

    public MyConn() {
        this.url = "jdbc:mysql://localhost:3306/football_player";
        this.username = "chuda";
        this.password = "12345";
    }

    public MyConn(String url) {
        this.url = url;
        this.username = "chuda";
        this.password = "12345";
    }
    
    
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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
    
    public List<String> getStiker(){
        List<String> listStriker = new ArrayList<String>();
        try {
            conn = (Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(getQuery());
            while (rs.next()) { 
                listStriker.add(rs.getString("Player Name")+", "+rs.getString("Player Overall")+", "+rs.getString("Club")+", "+rs.getString("Positions"));
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStriker;
    }
    
    public List<String> Player(){
        List<String> listStriker = new ArrayList<String>();
        try {
            conn = (Connection) DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(getQuery());
            while (rs.next()) { 
                listStriker.add(rs.getString("Player Name")+", "+rs.getString("Player Overall")+", "+rs.getString("Club")+", "+rs.getString("Positions"));
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStriker;
    }
    
}

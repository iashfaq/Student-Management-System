/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metropark.university;

import java.sql.*;

/**
 * @author laksh
 */
public class SQL_Connection {

    public String db_URL = "jdbc:mysql://localhost/metroparkuniversity";
    public String db_Username = "root";
    public String db_Password = "";
//    public static void main(String[] args) {
//        SQL_Connection sc = new SQL_Connection();
//        sc.db_Connect();
//    }
    public void db_Connect() {

        try {
            Connection con = DriverManager.getConnection(db_URL, db_Username, db_Password);
            if (con != null) {
                System.out.println("Database Connected Successfully !!!");

            }

        } catch (SQLException e) {
            System.out.println(e);

        }

    }
    
//
//    public static void main(String[] args) {
//        SQL_Connection s = new SQL_Connection();
//        s.db_Connect();
//    }
}

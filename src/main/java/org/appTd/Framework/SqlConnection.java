package org.appTd.Framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    Connection conn = null;

    public SqlConnection() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?" +
                    "user=java&password=java");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}

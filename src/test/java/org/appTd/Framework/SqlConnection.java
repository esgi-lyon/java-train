package org.appTd.Framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
    Connection conn = null;

    public void SqlConnection() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" +
                    "user=java&password=java");

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}

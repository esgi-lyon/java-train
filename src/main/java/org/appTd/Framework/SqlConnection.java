package org.appTd.Framework;

import org.sonatype.inject.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnection {
    Connection conn = null;
    // Target db
    String url = "localhost";
    String port = "3306";
    // Infos
    String user = "java";
    String pass = "java";
    String db = "java";

    public SqlConnection(
            @Nullable String url,
            @Nullable String port,
            @Nullable String user,
            @Nullable String pass,
            @Nullable String db
    ) {
        this.url = url != null ? url : this.url;
        this.port = port != null ? port : this.port;
        this.user = user != null ? user : this.user;
        this.pass = pass != null ? pass : this.pass;
        this.db = db != null ? db : this.db;
        this.connect();
    }

    public Connection getConn() {
        return conn;
    }

    protected String getFullUrl() {
        return "jdbc:mysql://" + url + ":" + port + "/" + db;
    }

    private void connect() {
        // Process connection
        try {
            Properties props = new Properties();
            props.put("user", this.user);
            props.put("password", this.pass);
            props.put("useUnicode", "true");
            props.put("useServerPrepStmts", "false"); // use client-side prepared statement
            props.put("characterEncoding", "UTF-8"); // ensure charset is utf8 here

            this.conn = DriverManager.getConnection(getFullUrl(), props);
            if (this.conn == null) throw new SQLException("Null connection");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}

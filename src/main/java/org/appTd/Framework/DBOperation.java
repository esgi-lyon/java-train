package org.appTd.Framework;

import java.sql.*;
import java.util.ArrayList;

public class DBOperation {

    Connection conn = (new SqlConnection(null, null, null, null, null))
            .getConn();

    /**
     * Example : statementStr => "INSERT INTO etudiant (nom, prenom) VALUES (?, ?)"
     *
     * @param statementStr
     * @param data
     */
    public void insert(String statementStr, ArrayList<String> data) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(statementStr + ";");

            int i = 1;
            for (String d : data) {
                preparedStatement.setString(i, d);
                i++;
            }

            preparedStatement.executeUpdate();
            conn.endRequest();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get List from select query
     * @param queryStr
     * @return
     */
    public ArrayList<String> list(String queryStr) {
        ArrayList<String> resList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(queryStr + ";");
            ResultSet rs = preparedStatement.executeQuery(queryStr);

            // to print the resultset on console
            int i = 1;
            while(rs.next()) {
                System.out.println(i);
                System.out.println(rs.toString());
                resList.add(rs.getString(i));
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resList;
    }
}

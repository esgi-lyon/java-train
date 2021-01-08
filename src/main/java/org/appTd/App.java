package org.appTd;

import org.appTd.Framework.DBOperation;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        DBOperation op = new DBOperation();

        // Etudiant 1
        ArrayList<String> data = new ArrayList<>();
        data.add("tata");
        data.add("toto");

        op.insert("INSERT INTO etudiant (nom, prenom) VALUES (?, ?)", data);

        op.list("SELECT * FROM etudiant");
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		ArrayList<Etudiant> listE = new ArrayList<Etudiant>();

		for (int i = 0; i < 2; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Prompt number");
			int numE = sc.nextInt();
			System.out.println("Prompt name");
			String nomE = sc.next();
			System.out.println("Prompt prenom");
			String prenomE = sc.next();
			Etudiant e1 = new Etudiant(numE, nomE, prenomE);
	    	listE.add(e1);
	    	e1.affichage();
		}

		System.out.println("\nEtu 0");
	    listE.get(0).affichage();
		System.out.println("\nEtu list");
		Etudiant.affichageList(listE);
    }
}

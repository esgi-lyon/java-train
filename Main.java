import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;




public class Main{
    public static void main(String[] args) {
        Personne p = new Personne();
        p.setNom("Gérard");
        p.setPrenom("Sibeth");
        p.setDate_naiss(new GregorianCalendar(2001,10,8));
        System.out.println(p.getNom()+ "" + p.getPrenom() +""+ p.calculAge());

        Personne p2 = new Personne("Man2","Jul2",new GregorianCalendar(2000,11,9));
        p2.affichage();
        p2.affichage(true);
        p2.affichage(false);
        System.out.println(p.getNbInstance()+ "Instance(s) de personne");

        System.out.println(p.getNumero()+ "Numero de la personne");
        System.out.println(p2.getNumero()+ "Numero de la personne");

        Client iencli = new Client("nom","prenom",new GregorianCalendar(1983,10,8),'P');
        iencli.affichage(true, 1);

        iencli.setPoids(90);
        System.out.println(iencli.getPoids());
        iencli.seDeplacer();

        System.out.println(p.Compare(iencli));
        lireFichier2("test.txt");
    }

    public static void lireFichier(String nomDuFichier) {
        FileInputStream file = null;
        BufferedReader buff = null;
        String line = null;

        try {
            file = new FileInputStream(nomDuFichier);
            buff = new BufferedReader(new java.io.InputStreamReader(file));
            line = buff.readLine();
            while(line != null) {
                System.out.println(line);
                line = buff.readLine();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(file != null) {
                try{
                    file.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
            if(buff != null) {
                try {
                    buff.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void lireFichier2(String nomDuFichier) {
        try (
            FileInputStream fichier = new FileInputStream(nomDuFichier);
            BufferedReader br = new BufferedReader(new InputStreamReader(fichier));
        ) {
            String ligne = br.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Logic done");
        }
    }
}
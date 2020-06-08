import java.util.GregorianCalendar;

public class MainNo {
    public static void main(String args[]) {
        Personne p = new Personne();
        p.setNom("Lacosté");
        p.setPrenom("Tn");
        p.setDateNaiss(new GregorianCalendar(1999,10,8));
        System.out.println(p.calculAge());
        Personne p2 = new Personne("toto", "jojo", new GregorianCalendar(3042,10,8));
        p2.affichage();
        p2.affichage(true);
        p2.affichage(false);
        
        if (p.getNbInstances() > 1) {
            System.out.println(p.getNbInstances()+ "pluriel");
        } else {
            System.out.println(p.getNbInstances());
        }

        System.out.println(p.getNumero());
        Client iencli = new Client("toto", "jojo", new GregorianCalendar(3042,10,8), 'Z');
        iencli.affichage(true, 1);
        iencli.setPoids(8000.00);
        iencli.seDeplacer();
    };
}
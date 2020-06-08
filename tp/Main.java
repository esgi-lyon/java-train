public class Main {
    public static void main(String args[]) {
        // Création des personnes
        User nicolas = new User("Nicolas");
        User jerem = new User("Jeremy");
        // Ouverture des comptes
        //Le compte courant de Nicolas a un découvert autorisé de 2000€
        nicolas.setCurrentAccount((new CurrentAccount(2000, true)));
        // Le compte épargne entreprise de Nicolas a un taux de 2%
        nicolas.setCompanyAccount(new CompanyAccount(0.02));
        // Le compte courant de Jérémie a un découvert autorisé de 500€
        jerem.setCurrentAccount(new CurrentAccount(500, true));
        // Nicolas touche son salaire de 100€, pas cher payé !
        Transaction salaire = new Transaction(nicolas.getCurrentAccount(), 'D', 100);
        salaire.execute();
        // Il fait le plein de sa voiture : 50€
        Transaction voiture = new Transaction(nicolas.getCurrentAccount(), 'W', 50);
        voiture.execute();
        // Il met de côté sur son compte épargne entreprise la coquette somme de 20€
        Transaction saveEpargne = new Transaction(nicolas.getCurrentAccount(), 'W', 20);
        saveEpargne.setDest(nicolas.getCompanyAccount());
        saveEpargne.execute();
        // Puis il reçoit un cadeau de la banque de 100€ car il a ouvert son compte pendant la période promotionnelle
        Transaction cadeau = new Transaction(nicolas.getCurrentAccount(), 'D', 100);
        cadeau.execute();
        // Il remet ses 20€ sur son compte bancaire car finalement, il ne se sent pas méga en sécurité
        Transaction saveSecurity = new Transaction(nicolas.getCurrentAccount(), 'D', 20);
        saveSecurity.execute();
        // Jérémie achète un nouveau PC : 500€
        Transaction achat = new Transaction(jerem.getCurrentAccount(), 'W', 500);
        achat.execute();
        // Puis il rembourse ses dettes à Nicolas : 200€
        Transaction dette = new Transaction(jerem.getCurrentAccount(), 'W', 500);
        dette.setDest(nicolas.getCurrentAccount());
        dette.execute();

        System.out.println(nicolas.getCurrentAccount().getBalance());
        System.out.println(jerem.getCurrentAccount().getBalance());
        // Affichages
    }
}

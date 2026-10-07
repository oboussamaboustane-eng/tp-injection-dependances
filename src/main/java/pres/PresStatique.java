package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        // Instanciation statique (Couplage fort)
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();

        // Injection des dépendances via le setter
        metier.setDao(dao);

        System.out.println("Résultat (Statique) : " + metier.calcul());
    }
}
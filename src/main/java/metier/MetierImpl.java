package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible : on déclare l'interface IDao, pas la classe DaoImpl
    private IDao dao;

    // Constructeur sans paramètres
    public MetierImpl() {
    }

    // Constructeur pour l'injection
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    // Setter pour l'injection
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp * 540 / Math.cos(temp * Math.PI);
    }
}
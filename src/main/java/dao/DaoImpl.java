package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de données");
        // Simulation d'une température
        return Math.random() * 40;
    }
}
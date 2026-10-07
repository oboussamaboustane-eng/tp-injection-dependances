package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        // Démarrer Spring en scannant les packages "dao" et "metier"
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        // Demander à Spring de nous donner l'objet métier
        IMetier metier = context.getBean(IMetier.class);

        // Afficher le résultat
        System.out.println("Résultat (Spring Annotations) : " + metier.calcul());
    }
}
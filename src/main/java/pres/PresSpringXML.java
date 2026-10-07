package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        // 1. Démarrer Spring en lisant le fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Demander à Spring de nous donner l'objet métier (dont l'ID est "metier" dans le XML)
        IMetier metier = (IMetier) context.getBean("metier");

        // 3. Afficher le résultat
        System.out.println("Résultat (Spring XML) : " + metier.calcul());
    }
}
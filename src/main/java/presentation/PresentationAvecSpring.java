package presentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.tp1.metier.MetierIMP;
import com.example.tp1.dao.DaoIMP;

public class PresentationAvecSpring {
    public static void main(String[] args) {
        // Chargement du contexte Spring depuis le fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Récupération des instances des beans
        MetierIMP metier = context.getBean("metier", MetierIMP.class);
        DaoIMP dao = context.getBean("dao", DaoIMP.class);

        // Utilisation des instances récupérées
        // ...

        // Fermeture du contexte Spring
        ((ClassPathXmlApplicationContext) context).close();
    }
}
}

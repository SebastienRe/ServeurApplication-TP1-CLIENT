import javax.naming.Context;
import javax.naming.InitialContext;

public class Client_entity {
    public static void main(String[] args) throws Exception {
        Context initcont = new InitialContext();
        bean_entity.IGestionLivre cm = (bean_entity.IGestionLivre) initcont.lookup("bean_entity.IGestionLivre");

        // cm.nouveauLivre("333", "Le monde d'Oniric");
        // cm.rendreLivre("333");
        cm.emprunterLivre("333");
    }
}
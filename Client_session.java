import javax.naming.Context;
import javax.naming.InitialContext;

public class Client_session {
    public static void main(String[] args) throws Exception {
        Context initcont = new InitialContext();

        System.out.println("partie Statefull :");
        bean_session.IStatefull cm = (bean_session.IStatefull) initcont.lookup("bean_session.IStatefull");
        System.out.println(cm.salut("seb"));
        System.out.println(cm.re_salut()+"\n");

        System.out.println("partie Stateless :");
        bean_session.IStateless cm2 = (bean_session.IStateless) initcont.lookup("bean_session.IStateless");
        System.out.println(cm2.salut("seb"));
    }
}


package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Grupo;
import entity.HibernateUtil;
import entity.Tabla;
import entity.User;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CreateGroup extends ActionSupport{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        Grupo grupo = new Grupo();
        grupo.setName(this.name);
        hibernateSession.save(grupo);
        t.commit(); 
        return SUCCESS;
    }  
}

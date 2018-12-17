
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Grupo;
import entity.HibernateUtil;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EditeActionGrupo extends ActionSupport{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        Grupo grupo=(Grupo)hibernateSession.load(Grupo.class,id);
        setId(grupo.getIdGrupo());
        setName(grupo.getName());
        t.commit(); 
        return SUCCESS;
    }  
    
}

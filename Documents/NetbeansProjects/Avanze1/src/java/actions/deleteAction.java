
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Tabla;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class deleteAction extends ActionSupport {
    private List lista;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        System.out.println("ID: "+ id);
         Transaction t=hibernateSession.beginTransaction(); 
        Query consulta=hibernateSession.createQuery("from User");
        lista=consulta.list();
        User user=(User)hibernateSession.load(User.class,id);
        hibernateSession.delete(user);
        t.commit(); 
        return SUCCESS;
    }  
    
}

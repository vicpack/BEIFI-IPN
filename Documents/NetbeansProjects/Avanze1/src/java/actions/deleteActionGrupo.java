
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Grupo;
import entity.HibernateUtil;
import entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class deleteActionGrupo extends ActionSupport {
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
        Transaction t=hibernateSession.beginTransaction(); 
        Query consulta=hibernateSession.createQuery("from Grupo");
        lista=consulta.list();
        Grupo grupo=(Grupo)hibernateSession.load(Grupo.class,id);
        hibernateSession.delete(grupo);
        t.commit(); 
        return SUCCESS;
    }  
    
    
}

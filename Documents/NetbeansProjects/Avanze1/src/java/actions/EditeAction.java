
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class EditeAction extends ActionSupport{
    int id;
    String email,tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        User user=(User)hibernateSession.load(User.class,id);
        setId(user.getIdUser());
        setEmail(user.getEmail());
        setTipo(user.getTipo());
        t.commit(); 
        return SUCCESS;
    }  
}

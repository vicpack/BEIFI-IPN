
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Tabla;
import entity.User;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MenuAction extends ActionSupport{
    
    String email,password, tipo;
    Session hibernateSession;
    User user;
    private ArrayList<User> datos;
    private Tabla op;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
      public ArrayList<User> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<User> datos) {
        this.datos = datos;
    }


       public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        this.op=new Tabla();
        this.datos=op.getUsuarios();
        return SUCCESS;
    }
}


package actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.Grupo;
import entity.HibernateUtil;
import entity.Tabla;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class grupoAction extends ActionSupport{
     
    String name;
    Session hibernateSession;
    Grupo grupo;
    private ArrayList<Grupo> datos;
    private Tabla op;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Grupo> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Grupo> datos) {
        this.datos = datos;
    }

    public Tabla getOp() {
        return op;
    }

    public void setOp(Tabla op) {
        this.op = op;
    }

   

       public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        this.op=new Tabla();
        this.datos=op.getGrupo();
        return SUCCESS;
    }
}

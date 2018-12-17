
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class InsertAction extends ActionSupport{

 String email , password,tipo;
 


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
    
    
   
    
     public String execute() throws Exception {
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        User user=new User();
        user.setPassword(this.password);
        user.setEmail(this.email);
        user.setTipo(this.tipo);
        hibernateSession.save(user);
        t.commit(); 
        return SUCCESS;
    }  
     
 
}

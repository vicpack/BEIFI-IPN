
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DeleteUser extends ActionSupport{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String execute() throws Exception {
    
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        User user=(User)hibernateSession.load(User.class,id);
        hibernateSession.delete(user);
        t.commit(); 
        return SUCCESS;
    }  
}


package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Tabla;
import entity.User;
import java.util.ArrayList;


public class AdminControl extends ActionSupport {
    private ArrayList<User> datos;
    private Tabla op;
    private User user;

    public ArrayList<User> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<User> datos) {
        this.datos = datos;
    }

    public Tabla getOp() {
        return op;
    }

    public void setOp(Tabla op) {
        this.op = op;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
    @Override
    public String execute() throws Exception 
    {
        this.op=new Tabla();
        this.datos=op.getUsuarios();
        return SUCCESS;
    }
    
}

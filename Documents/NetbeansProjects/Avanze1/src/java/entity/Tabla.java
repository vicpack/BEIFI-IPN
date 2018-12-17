
package entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Tabla {
      public ArrayList<User> getUsuarios()
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
       Transaction tx = session.beginTransaction();
      ArrayList<User> arreglo=new ArrayList<>();
        Query q = session.createQuery("from User");
        List<User> lista = q.list();
       Iterator<User> iter=lista.iterator();
       tx.commit();
        session.close();
       while(iter.hasNext())
        {
            User noti = (User) iter.next();
            arreglo.add(noti);
        }
        return arreglo;
       
     
    }
   public ArrayList<Grupo> getGrupo()
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
       Transaction tx = session.beginTransaction();
      ArrayList<Grupo> arreglo=new ArrayList<>();
        Query q = session.createQuery("from Grupo");
        List<Grupo> lista = q.list();
       Iterator<Grupo> iter=lista.iterator();
       tx.commit();
        session.close();
       while(iter.hasNext())
        {
            Grupo gru = (Grupo) iter.next();
            arreglo.add(gru);
        }
        return arreglo;
       
     
    }
   
    public User getUsuarioPorId(int idUser)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        User usr=(User)session.get(User.class, idUser);
        tx.commit();
        session.close();
        return usr;
    }
    
    
     public void deleteUsuario(int id)
     {
         SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        User usr=(User)session.get(User.class, id);
        session.delete(usr);
        tx.commit();
        session.close();
     }
    public void addUsuario(User user)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }
}

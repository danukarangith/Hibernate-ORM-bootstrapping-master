package repository;

import config.SessionFactoryConfig;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import projection.CustomerProjection;

import java.lang.annotation.Native;
import java.util.List;

public class CustomerRepository {

    private  final  Session session;
    public  CustomerRepository(){
         session = SessionFactoryConfig
                .getInstance()
                .getSession();
    }

    public  int saveCustomer(Customer customer) {
        Transaction transaction = session.beginTransaction();
        try {
            int customerId = (int) session.save(customer);
            transaction.commit();
            session.close();
            return customerId;
        } catch (Exception e) {
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return  -1;
        }
    }

    public Customer getCustomer(int id) throws  RuntimeException{
        try{
           Customer customer = session.get(Customer.class,id);
           session.close();
           return  customer;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
            throw  e;
        }
    }

    public  boolean updateCustomer(Customer customer){
        Transaction transaction =session.beginTransaction();
        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return  true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return  false;

        }
    }

    public  boolean deleteCustomer(Customer customer){
        Transaction transaction =session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            session.close();
            return  true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return  false;
        }

    }

    public List<Object[]> getAllCustomersNative(){
        String sql = "SELECT * FROM customer";
        NativeQuery query =session.createSQLQuery(sql);
        List<Object[]> list = query.list();
        for(Object customer : list){
            System.out.println(customer);
        }
        session.close();
        return list;
    }

    public  List<Customer> getAllCustomerJPQL(){
        String sql = "SELECT C FROM Customer As C";
        Query query =session.createQuery(sql);
        List  list = query.list();
        session.close();
        return list;




    }
    public List<Order> getOrdersByCustomerId(int cusId){
        String sql = "SELECT O FROM Order AS O\n" +
                "INNER JOIN Customer AS C ON O.customer.id= C.id\n"+
                "WHERE O.customer.id=:cus_id";
        Query query = session.createQuery(sql);
        query.setParameter("cus_id",cusId);
        List list = query.list();
        session.close();
        return list;


    }


}

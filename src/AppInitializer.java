

import entity.Customer;
import entity.Order;
import projection.CustomerProjection;
import repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

        // 1. Save
//        Session session = SessionFactoryConfig
//                .getInstance()
//                .getSession();
//        Transaction transaction = session.beginTransaction();
//        Customer customer = getCustomer();
//        session.save(customer);
//        transaction.commit();
//        session.close();

        // Save
//        CustomerRepository customerRepository
//                = new CustomerRepository();
//        customerRepository.saveCustomer(getCustomer());

        //Get
//       CustomerRepository customerRepository = new CustomerRepository();
//        Customer customer = customerRepository.getCustomer(1);
//        System.out.println(customer);


//        CustomerRepository customerRepository1 = new CustomerRepository();
//        customerRepository1.getAllCustomersNative();
//
//        CustomerRepository customerRepository2 = new CustomerRepository();
//        List<Customer> allCustomerJPQL = customerRepository2.getAllCustomerJPQL();
//        for (Customer customer : allCustomerJPQL) {
//            System.out.println(customer);
//        }


//        CustomerRepository customerRepository3
//                = new CustomerRepository();
//        List<Order> ordersList = customerRepository3
//                .getOrdersByCustomerId(1);
//        for (Order order : ordersList) {
//            System.out.println(order);
//        }

//        CustomerRepository customerRepository =new CustomerRepository();
//        List<Customer> customerList = customerRepository.getCustomerHQL();
//        for(Customer customer : customerList){
//            System.out.println(customer);
//
//        }

        CustomerRepository customerRepository1 = new CustomerRepository();
        List<CustomerProjection> customerprojection = customerRepository1.getCustomerProjection();
        for (CustomerProjection customerProjection : customerprojection){
            System.out.println(customerProjection);
        }

//        // Update
//        customerRepository = new CustomerRepository();
//        customer.setAddress("Matara");
//        boolean isUpdated = customerRepository.updateCustomer(customer);
//        if (isUpdated) {
//            System.out.println("Customer Updated");
//        } else {
//            System.out.println("Update failed");
//        }
//
//        // Delete
//        customerRepository = new CustomerRepository();
//        customerRepository.deleteCustomer(customer);

//        // 2 Get
//        System.out.println("-----GET-----");
//        Session getSession = SessionFactoryConfig
//                .getInstance()
//                .getSession(); // 1
//        Customer existingCustomer =
//                getSession
//                        .get(Customer.class,
//                                1);
//        System.out.println("Existing Customer: "
//                + existingCustomer);
//        getSession.close();
//        System.out.println("-----GET-----");
//
//        // Update
//        System.out.println("-----UPDATE-----");
//        Session updateSession = SessionFactoryConfig
//                        .getInstance()
//                        .getSession(); // 2
//
//        Transaction updateTransaction = updateSession
//                .beginTransaction();
//        Customer existingCus = updateSession
//                .get(Customer.class,
//                        1);
//        existingCus.setAddress("Matara");
//        updateSession.update(existingCus);
//        updateTransaction.commit();
//        updateSession.close();
//        System.out.println("-----UPDATE-----");
//
//        // Delete
//        System.out.println("-----DELETE-----");
//        Session deleteSession = SessionFactoryConfig
//                .getInstance()
//                .getSession();  // 3
//        Transaction deleteTransaction =
//                deleteSession
//                .beginTransaction();
//        Customer existingCusDelete =
//                deleteSession
//                .get(Customer.class, 1);
//        deleteSession.delete(existingCusDelete);
//        deleteTransaction.commit();
//        deleteSession.close();
//        System.out.println("-----DELETE-----");
    }

    private static Customer getCustomer() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Nadeesha");
//        customer.setName(getNameIdentifier());

//        List<MobileNo> mobileNos = getMobileNos();
//        customer.setMobileNos(mobileNos);

        customer.setAddress("Galle");
//        customer.setSalary(25000);
        return customer;
    }

//    private static List<MobileNo> getMobileNos() {
//        MobileNo homeNo = new MobileNo();
//        homeNo.setType("HOME");
//        homeNo.setMobileNo("0914578980");
//        MobileNo mobileNo = new MobileNo();
//        mobileNo.setType("MOBILE");
//        mobileNo.setMobileNo("0715678679");
//        List<MobileNo> mobileNos = new ArrayList<>();
//        mobileNos.add(homeNo);
//        mobileNos.add(mobileNo);
//        return mobileNos;
//    }
//
//    private static NameIdentifier getNameIdentifier() {
//        NameIdentifier nameIdentifier = new NameIdentifier();
//        nameIdentifier.setFirstName("Saman");
//        nameIdentifier.setMiddleName("De");
//        nameIdentifier.setLastName("Silva");
//        return nameIdentifier;
//    }
}

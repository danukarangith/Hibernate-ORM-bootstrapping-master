//package entity;
//
//import embedded.MobileNumber;
//import embedded.Nameidentifire;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
////@Entity(name = "customer")
//
//@Entity
//@Table(name = "customer")
//
//public class CustomerOld {
//
//    @Id //  Tells Hibernate that this is the primary key  of table
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "customer_id")
//    private  int id;
//
//    @Column(name = "customer_name")
//    private Nameidentifire name;
//
//    @Column(name = "customer_address" , length = 100 ,nullable = false)
//    private  String address;
//
//
//    @Transient
//    @Column(name = "customer_salary")
//    private  double salary;
//
//    @CreationTimestamp
//    private Timestamp createdDateTime;
//
//    @UpdateTimestamp
//    private  Timestamp updateDateTime;
//
//
//    @ElementCollection
//    @CollectionTable(name = "customer_mobile_nos" ,joinColumns = @JoinColumn(name = "customer_id"))
//    private List<MobileNumber>mobileNumbers = new ArrayList<>();
//
//    @Transient
//    @Column(name ="customer_age")
//    private int age;
//
//    public CustomerOld() {
//    }
//
//    public CustomerOld(int id, Nameidentifire name, String address, double salary, Timestamp createdDateTime, Timestamp updateDateTime, List<MobileNumber> mobileNumbers, int age) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.salary = salary;
//        this.createdDateTime = createdDateTime;
//        this.updateDateTime = updateDateTime;
//        this.mobileNumbers = mobileNumbers;
//        this.age = age;
//    }
//
//    public Nameidentifire getName() {
//        return name;
//    }
//
//    public void setName(Nameidentifire name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", salary=" + salary + '\'' +
////                ", mobileNo=" + mobileNumbers +
//                '}';
//    }
//
//
//    public List<MobileNumber> getMobileNumbers() {
//        return mobileNumbers;
//    }
//
//    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
//        this.mobileNumbers = mobileNumbers;
//    }
//}
//

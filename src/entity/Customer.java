package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customer")
public class Customer {

    @Id //  Tells Hibernate that this is the primary key  of table
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "customer_id")
   private  int id;

    @Column(name = "Customer_name")
    private  String name;

    @Column(name = "Customer_address")
    private  String address;

     @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER , mappedBy = "customer")
     private List<Order> orders = new ArrayList<>();


    public Customer() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}

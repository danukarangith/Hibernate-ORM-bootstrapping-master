package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item_id")
    private int id;

    @Column(name = "Item_name")
    private int name;

    @Column(name = "Qty")
    private int qty;

    @Column(name = "unit_price")
    private double unitPrice;


//    @ManyToMany(mappedBy = "items")
//    private List<Order> orders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.LAZY , mappedBy = "item")
    private  List<OrderDetail> orderDetails = new ArrayList<>();

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name=" + name +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Item(int id, int name, int qty, double unitPrice) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}

package entity;


import embedded.OrderDetailPK;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailPK orderDetailPK;

    @Column(name = "order_quantity")
    private  int orderQty;

    @Column(name = "order_price")
    private  double  price;




    @ManyToOne
    @JoinColumn(name = "order_id" , referencedColumnName = "order_id" ,
            insertable = false,
            updatable = false
    )
    private  Order order;

    @ManyToOne
    @JoinColumn(name = "item_id" , referencedColumnName = "item_id" ,
              insertable = false,
              updatable = false
    )

    private  Item item;


    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderDetail() {
    }

    public OrderDetail(int orderQty, double price) {
        this.orderQty = orderQty;
        this.price = price;
    }



}

package embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable {

    @Column(name = "order_id")
    private  int orderId;

    @Column(name = "item_id")
    private  int itemId;




}

package projection;

public class CustomerProjection {
    private int customerId;
    private  String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public CustomerProjection() {
    }

    public CustomerProjection(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerProjection{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

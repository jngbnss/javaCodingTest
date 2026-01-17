package ref.ex;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        return new ProductOrder(productName,price,quantity);

    }

    void printOrders(){
        System.out.println("상품명: "+productName
        +", 가격: "+price
        +", 수량: "+quantity);

    }
    int getTotalAmount(){
        return price*quantity;
    }
}

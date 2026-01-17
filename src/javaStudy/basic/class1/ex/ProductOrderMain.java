package javaStudy.basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = new ProductOrder("두부",2000,2);
        productOrders[1] = new ProductOrder("김치",5000,1);
        productOrders[2] = new ProductOrder("콜라", 1500, 2);

        int result = 0;
        for (ProductOrder productOrder : productOrders) {
            result+=productOrder.sum();
            System.out.println(productOrder.toString());
        }
        System.out.println(result);
    }
}

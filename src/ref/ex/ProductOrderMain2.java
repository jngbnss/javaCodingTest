package ref.ex;

import static ref.ex.ProductOrder.createOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];


        //createaOrder()를 여러번 사용해서 상품 주문 정보 생성 하고 배열에 저장
        productOrders[0] = createOrder("두부",2000,2);
        productOrders[1] = createOrder("김치",5000,1);
        productOrders[2] = createOrder("콜라",1500,2);

        //printOrders()를 사용해서 상품 주문 정보 출력
        for (int i = 0; i < 3; i++) {
            productOrders[i].printOrders();
        }
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum+=productOrders[i].getTotalAmount();
        }
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: "+sum);

    }
}

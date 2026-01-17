package ref.ex;
import java.io.*;
import static ref.ex.ProductOrder.createOrder;

public class ProductOrderMain3 {
    public static void main(String[] args) throws IOException {

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = br.readLine();
            System.out.print("가격: ");
            int price = Integer.parseInt(br.readLine());
            System.out.print("수량: ");
            int quantity = Integer.parseInt(br.readLine());

            productOrders[i] = createOrder(productName,price,quantity);
        }

        //printOrders()를 사용해서 상품 주문 정보 출력
        for (int i = 0; i < n; i++) {
            productOrders[i].printOrders();
        }
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=productOrders[i].getTotalAmount();
        }
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: "+sum);

    }
}

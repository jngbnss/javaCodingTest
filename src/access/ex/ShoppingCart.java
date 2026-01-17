package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount>=10){
            System.out.println("장바구니가 가득 찼습니다.");
        }else {
            items[itemCount++] = item;
        }
    }

    public void displayItems(){
        int totalPrice = 0;
        for (Item item : items) {
            if(item==null){
                break;
            }
            System.out.println("장바구니 상품 출력");
            int tempPrice = item.getPrice()*item.getQuantity();
            totalPrice+=tempPrice;
            System.out.println("상품명: "+item.getName()+", 합계: "+tempPrice);
        }
        System.out.println("전체 가격 합:"+totalPrice);
    }
}

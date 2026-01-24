package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();

        integerBox.setValue(10);
        Integer result = (Integer) integerBox.getValue();
//        integerBox.getValue();
        System.out.println("result = " + result);
    }
}

package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        //  생성  시점에 T의 타입 결정
        integerBox.setValue(10);
//        integerBox.setValue("문자100");
        // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.getValue();
        // Integer 타입만 허용, 컴파일 오류
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
        // String 타입만 허용
        //String 타입만 반환

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(10.5);
        Double value = doubleBox.getValue();
        System.out.println("value = " + value);
        // 타입  추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();


    }
}

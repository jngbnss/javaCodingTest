package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
        // T의 타입을 메서드를정의하는 시점에는 알 수 없다.
        // Object의 기능만 사용 가능

        // 컴파일 오류
        System.out.println("동물 이름: "+animal.getName());
        animal.sound();
    }

    public T getBigger(T target) {
        //컴파일 오류
        return animal.getSize()>target.getSize()?animal:target;
//        return null;
    }
}

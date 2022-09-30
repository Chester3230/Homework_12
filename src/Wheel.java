public interface Wheel {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

package builder;

public class Main {
    public static void main(String[] args) {

        Burger burger = Burger.builder()
                .breadType(BreadType.WHEAT)
                .meat("chicken")
                .salad("cabbage")
                .cheese("chedar")
                .sauce("garlic")
                .hasBeacon(true)
                .build();

        System.out.println(burger);
    }
}

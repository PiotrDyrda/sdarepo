package builder;

import javafx.util.Builder;

public class Burger {

    private final BreadType bread;
    private final String meat;
    private final String salad;
    private final String cheese;
    private final String sauce;
    private final boolean hasBeacon;

    @Override
    public String toString() {
        return "Burger{" +
                "bread = " + bread +
                ", meat = '" + meat + '\'' +
                ", salad = '" + salad + '\'' +
                ", cheese = '" + cheese + '\'' +
                ", sauce = '" + sauce + '\'' +
                ", hasBeacon = " + hasBeacon +
                '}';
    }

    public BreadType getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isHasBeacon() {
        return hasBeacon;
    }

    private Burger(Builder builder) {
        bread = builder.bread;
        meat = builder.meat;
        salad = builder.salad;
        cheese = builder.cheese;
        sauce = builder.sauce;
        hasBeacon = builder.hasBeacon;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private BreadType bread;
        private String meat;
        private String salad;
        private String cheese;
        private String sauce;
        private boolean hasBeacon;

        private Builder() {
            bread = BreadType.WHEAT;
            meat = "beef";
        }

        public Builder breadType(BreadType bt) {
            bread = bt;
            return this;
        }

        public Builder meat(String meatType) {
            meat = meatType;
            return this;
        }

        public Builder salad(String saladType) {
            salad = saladType;
            return this;
        }

        public Builder cheese(String cheeseType) {
            cheese = cheeseType;
            return this;
        }

        public Builder sauce(String sauceType) {
            sauce = sauceType;
            return this;
        }

        public Builder hasBeacon(boolean beacon) {
            hasBeacon = beacon;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

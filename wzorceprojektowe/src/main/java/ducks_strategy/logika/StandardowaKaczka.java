package ducks_strategy.logika;

import ducks_strategy.Duck;

public abstract class StandardowaKaczka implements Duck {

    private Kwaczacy kwakanie;
    private Latajacy latanie;
    private Plywajacy plywanie;


    protected StandardowaKaczka(Kwaczacy kwakanie, Latajacy latanie, Plywajacy plywanie) {
        this.kwakanie = kwakanie;
        this.latanie = latanie;
        this.plywanie = plywanie;
    }

    @Override
    public void swim() {
        plywanie.swim();
    }

    @Override
    public void kwacz() {
        kwakanie.kwacz();
    }

    @Override
    public void fly() {
        latanie.fly();
    }

    public class Cyraneczka extends StandardowaKaczka {
        public Cyraneczka() {
            super(new Kwakanie(), new LatanieNaSkrzydlach(),new Plywa());
        }
    }

    public class KaczkaKrzyzowka extends StandardowaKaczka {
        public KaczkaKrzyzowka() {
            super(new Kwakanie(), new LatanieNaSkrzydlach(),new Plywa());
        }
    }

    public class GumowaKaczuszka extends StandardowaKaczka {
        public GumowaKaczuszka() {
            super(new Piszczenie(), new NieLata(),new Dryfuje());
        }
    }
}

package ducks_strategy;

import ducks_strategy.logika.Kwakanie;
import ducks_strategy.logika.LatanieNaSkrzydlach;
import ducks_strategy.logika.Plywa;
import ducks_strategy.logika.StandardowaKaczka;

public class GumowaKaczuszka extends StandardowaKaczka {

//    private final Latajacy latanie;
//    private final Kwaczacy kwakanie;
//    private final Plywajacy plywanie;

    public GumowaKaczuszka() {
        super(new Kwakanie(), new LatanieNaSkrzydlach(),  new Plywa());
//        latanie = new NieLata();
//        kwakanie = new Piszczenie();
//        plywanie = new Dryfuje();
    }
//
//    @Override
//    public void swim() {
//        plywanie.swim();
//    }
//
//    @Override
//    public void kwacz() {
//        kwakanie.kwacz();
//    }
//
//    @Override
//    public void fly() {
//        latanie.fly();
//    }
}

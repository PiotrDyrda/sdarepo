package ducks_strategy;

import ducks_strategy.logika.Dryfuje;
import ducks_strategy.logika.LatanieNaSkrzydlach;
import ducks_strategy.logika.Piszczenie;
import ducks_strategy.logika.StandardowaKaczka;

public class Cyraneczka extends StandardowaKaczka {

//    private final Latajacy latanie;
//    private final Kwaczacy kwakanie;
//    private final Plywajacy plywanie;

    public Cyraneczka() {
        super(new Piszczenie(),new LatanieNaSkrzydlach(), new Dryfuje());
//        latanie = new LatanieNaSkrzydlach();
//        kwakanie = new Kwakanie();
//        plywanie = new Plywa();
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

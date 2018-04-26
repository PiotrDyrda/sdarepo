package ducks_strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Duck k1 = new KaczkaKrzyzowka();
        Duck k2 = new Cyraneczka();
        Duck k3 = new GumowaKaczuszka();

        List<Duck> kaczki = new ArrayList<>();

        kaczki.add(k1);
        kaczki.add(k2);
        kaczki.add(k3);

        for (Duck kaczka:kaczki) {
            kaczka.fly();
            kaczka.swim();
            kaczka.kwacz();
            System.out.println();
        }

//        k1.swim();
//        k1.kwacz();
//        k1.fly();
//
//        System.out.println();
//
//        k2.swim();
//        k2.kwacz();
//        k2.fly();
//
//        System.out.println();
//
//        k3.swim();
//        k3.kwacz();
//        k3.fly();
    }
}

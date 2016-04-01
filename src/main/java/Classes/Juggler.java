package Classes;

import Interfaces.Performer;

/**
 * Created by Alexandr on 01.04.2016.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
            this.beanBags = beanBags;
        }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public void setBeanBags(int beanBags){
        this.beanBags = beanBags;
    }
}


package Classes;

import Interfaces.Poem;
/**
 * Created by Alexandr on 01.04.2016.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) { // Внедрение поэмы
        super();
        this.poem = poem;
    }
    public PoeticJuggler(int beanBags, Poem poem) { // Внедрение количества
        super(beanBags); // мячиков и поэмы
        this.poem = poem;
    }
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }

    public void setBeanBags(int beanBags){
        super.setBeanBags(beanBags);
    }
}

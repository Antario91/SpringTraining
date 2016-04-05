package Classes;

import Interfaces.Performer;
import Interfaces.Instrument;

/**
 * Created by Alexandr on 01.04.2016.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}

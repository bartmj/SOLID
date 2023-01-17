package Open_closed_principle.correct;

import java.security.InvalidParameterException;

public class Jukebox {

    public void play(Instrument instrument) {
        if (instrument == null) {
            throw new InvalidParameterException();
        }

        instrument.play();

    }
}

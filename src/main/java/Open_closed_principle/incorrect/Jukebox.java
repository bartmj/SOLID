package Open_closed_principle.incorrect;

import java.security.InvalidParameterException;

public class Jukebox {

    public void play(Instrument instrument) {
        if (instrument == null) {
            throw new InvalidParameterException();
        }

        if (instrument instanceof Piano) {
            playPianoSound();
        } else if (instrument instanceof Guitar) {
            playGuitarSound();
        }

    }

    private void playGuitarSound() {
        System.out.println("Plays guitar sound!");
    }

    private void playPianoSound() {
        System.out.println("Plays piano sound!");
    }

}

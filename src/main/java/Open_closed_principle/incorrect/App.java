package Open_closed_principle.incorrect;

public class App {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(1, "Acoustic guitar");
        Jukebox jukebox = new Jukebox();
        jukebox.play(guitar);
    }
}

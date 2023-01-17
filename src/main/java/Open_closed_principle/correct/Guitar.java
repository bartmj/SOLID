package Open_closed_principle.correct;

public class Guitar implements Instrument {

    private long id;
    private String name;

    public Guitar(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Plays guitar sound!");
    }
}

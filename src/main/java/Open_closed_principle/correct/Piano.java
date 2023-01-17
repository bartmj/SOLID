package Open_closed_principle.correct;

public class Piano implements Instrument {

    private long id;
    private String name;

    public Piano(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Plays piano sound!");
    }
}

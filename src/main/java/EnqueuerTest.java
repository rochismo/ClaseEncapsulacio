import static org.junit.Assert.*;

public class EnqueuerTest {
    private String bolo  = new String("Bolo");
    private String jordi = new String("Jordi");
    private String cristian = new String("Crsitian");
    private String benja = new String("Benja");

    private Enqueuer stringEnqueuer = new StringQueue();
    private Enqueuer stackEnqueuer = new Cola();

    @org.junit.Test
    public void add() {
        stringEnqueuer.add(bolo);
        assertEquals(1, stringEnqueuer.getLength());
        stringEnqueuer.add(jordi);
        assertEquals(2, stringEnqueuer.getLength());
        stringEnqueuer.add(cristian);
        assertEquals(3, stringEnqueuer.getLength());

    }

    @org.junit.Test
    public void remove() {
        stringEnqueuer.remove();
        assertEquals(2, stringEnqueuer.getLength());
        stringEnqueuer.remove();
        assertEquals(1, stringEnqueuer.getLength());
        stringEnqueuer.remove();
        assertEquals(0, stringEnqueuer.getLength());


    }

    @org.junit.Test
    public void addTest() {
        add();
        remove();
    }
}
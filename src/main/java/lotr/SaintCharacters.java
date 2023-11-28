package lotr;
import kick.ScStrategy;
import java.util.Random;
public class SaintCharacters extends Character{
    private static final Random rd = new Random();

    public SaintCharacters (int bound) {
        super(rd.nextInt(10) + bound, rd.nextInt(10) + bound, new ScStrategy());
    }
}

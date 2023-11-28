
package lotr;
import kick.Cry;
import kick.KickStrategy;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0, new Cry());
    }
    @Override
    public void kick(Character oppponent) {
        System.out.println("hobbit");
    }
}


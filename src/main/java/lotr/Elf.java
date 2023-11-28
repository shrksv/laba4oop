package lotr;
import kick.Cry;
public class Elf extends Character {
    public Elf() {
        super(10, 10, new Cry());
    }

    @Override
    public void kick(Character oppponent) {
        if (oppponent.getPower() < this.getPower()) {
            oppponent.setHp(0);
        } else {
            oppponent.setPower(oppponent.getPower()-1);
        }
    }
}
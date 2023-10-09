import java.util.Random;
class King extends Character {
    Random rand = new Random();

    public King() {
        this.power = rand.nextInt(11) + 5;  
        this.hp = rand.nextInt(11) + 5;
    }

    @Override
    public void kick(Character c) {
        int damage = rand.nextInt(this.power + 1);
        c.setHp(c.getHp() - damage);
    }
}
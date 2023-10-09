abstract class Character {
    protected int power;
    protected int hp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
}

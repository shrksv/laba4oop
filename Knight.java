class Knight extends King {
    public Knight() {
        this.power = rand.nextInt(11) + 2;
        this.hp = rand.nextInt(11) + 2;
    }
}
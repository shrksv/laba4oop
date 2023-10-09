import java.util.Random;
class CharacterFactory {
    Random rand = new Random();

    public Character createCharacter() {
        int choice = rand.nextInt(4);
        switch (choice) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }
}
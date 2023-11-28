package lotr;

public class GameManager {

    public static void fight(Character c1, Character c2) {
        printFightIntroduction(c1, c2);

        if (bothCharactersAreOfSameType(c1, c2, Elf.class)) {
            System.out.println("Elf can't fight against Elf");
            return;
        }

        if (bothCharactersAreOfSameType(c1, c2, Hobbit.class)) {
            System.out.println("Hobbit can't fight against Hobbit");
            return;
        }

        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            printRoundDetails(round, c1, c2);
            c1.kick(c2);

            if (!c2.isAlive()) {
                break;
            }

            printRoundDetails(round, c2, c1);
            c2.kick(c1);
            round++;
        }

        System.out.println(c1.isAlive() ?
                c1.getClass().getSimpleName() + " won" :
                c2.getClass().getSimpleName() + " won");
    }

    private static void printFightIntroduction(Character c1, Character c2) {
        System.out.printf("\n%s with health %d fights %s with health %d\n\n",
                c1.getClass().getSimpleName(), c1.getHp(),
                c2.getClass().getSimpleName(), c2.getHp());
    }

    private static void printRoundDetails(int round, Character attacker, Character defender) {
        System.out.printf("\n%d round\n%s hits %s with power %d\n",
                round,
                attacker.getClass().getSimpleName(),
                defender.getClass().getSimpleName(),
                attacker.getPower());
    }

    private static boolean bothCharactersAreOfSameType(Character c1, Character c2, Class<?> obj) {
        return obj.isInstance(c1) && obj.isInstance(c2);
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}

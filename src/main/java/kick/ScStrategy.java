package kick;

import lotr.Character;

public class ScStrategy implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - whoKick.getPower());
    }
}
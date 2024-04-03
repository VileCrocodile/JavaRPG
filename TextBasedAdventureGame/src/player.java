public class player {

    private int HP;
    private int maxHP;
    private int xp;
    private int atk;
    private int def;
    private int lvl;

    private int numPotions;

    public player() {
        HP = maxHP;
        lvl = 1;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hp) {
        HP = hp;
    }

    public boolean isAlive() {
        return HP > 0;
    }

}

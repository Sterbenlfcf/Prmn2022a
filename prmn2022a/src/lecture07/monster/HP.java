package lecture07.monster;

public class HP {

    private int hp;
    private static int dead = 0;

    public HP(int hp){
        this.hp = hp;
    }

    public boolean isAlive(){
        return this.hp > this.dead;
    }

    public int getHP(){
        return this.hp;
    }

}

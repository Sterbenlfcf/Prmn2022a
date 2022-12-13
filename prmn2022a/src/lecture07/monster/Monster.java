package lecture07.monster;

import lecture07.skill.Skill;

import java.util.ArrayList;
import java.util.List;

public class Monster extends HP implements IMonster{

    private String name;
    private HP hp = new HP();
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills = new ArrayList<>();

    protected Monster(String name, int hp, int power, int defense, int speed, List<Skill> skills){
        this.name = name;
        setHP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster){

    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp.getHP();
    }

    public void setHP(int hp){
        this.hp = new HP();
    }

    public int getPower(){
        return this.power;
    }

    public int getDefense(){
        return this.defense;
    }

    public boolean isAlive(){
        return this.hp.getHP() > 0;
    }

}

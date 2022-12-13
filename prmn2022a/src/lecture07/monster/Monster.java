package lecture07.monster;

import lecture07.skill.Skill;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IMonster{

    private String name;
    private HP hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills;

    protected Monster(String name, int hp, int power, int defense, int speed, List<Skill> skills){
        this.name = name;
        this.hp = new HP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster){
        this.name = monster.getName();
        this.hp = monster.getHP();
        this.power = monster.getPower();
        this.defense = monster.getDefense();

    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp.getHP();
    }

    public void setHP(int hp){
        this.hp = new HP(hp);
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

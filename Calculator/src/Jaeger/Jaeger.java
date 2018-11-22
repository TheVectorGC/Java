package Jaeger;

public class Jaeger {
    private String name;
    private boolean alive;
    private int speed;
    private int strength;
    private int armor;


    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean getAlive() {
        return alive;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }
    public void battle(Jaeger jaeger) {
        System.out.println(name + "Атаковал" + jaeger.getName());
    }
}

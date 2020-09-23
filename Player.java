public class Player {

    //Variable Initialization
    private String Name;
    private int Health;
    private double Money;
    private int Strength;
    private int Armor;
    private int Speed;
    private int Charisma;

    public Player(String name, int health, double money, int strength, int armor, int speed, int charisma) {
        Name = name;
        Health = health;
        Money = money;
        Strength = strength;
        Armor = armor;
        Speed = speed;
        Charisma = charisma;

    }

    // Get and Set Elements


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

}


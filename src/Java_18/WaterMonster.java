package Java_18;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }@Override
    public String attack() {
        return "Attack with water!";
    }
}

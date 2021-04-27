package ornament;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "重烘焙咖啡";
    }

    @Override
    public int getCost() {
        return 20;
    }
}

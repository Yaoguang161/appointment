package ornament;

public class Whip extends Decorator{
    public Whip(Beverage coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+"加奶泡";
    }
    @Override
    public int getCost() {
        return super.getCost()+8;
    }
}

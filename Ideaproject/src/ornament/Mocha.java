package ornament;

public class Mocha extends Decorator{
    public Mocha(Beverage coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"加摩卡";
    }

    @Override
    public int getCost() {
        return super.getCost()+10;
    }
}

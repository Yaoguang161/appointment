package ornament;

public class Decorator extends Beverage{
    private Beverage coffee;
    public Decorator(Beverage coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
    @Override
    public int getCost() {
        return coffee.getCost();
    }
}

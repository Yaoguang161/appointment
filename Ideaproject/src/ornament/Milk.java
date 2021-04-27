package ornament;

public class Milk extends Decorator{
    public Milk(Beverage coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"加牛奶";
    }
    public int getCost(){
        return super.getCost()+6;
    }
}

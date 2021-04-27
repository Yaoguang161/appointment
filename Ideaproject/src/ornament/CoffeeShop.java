package ornament;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        System.out.println(coffee.getDescription() + ":" + coffee.getCost());

        //加摩卡
        Beverage coffeeM = new Mocha(coffee);
        System.out.println(coffee.getDescription() + ":" + coffeeM.getCost());

        //加牛奶
        Beverage coffeeMM = new Milk(coffeeM);
        System.out.println(coffeeMM.getDescription()+":"+coffeeMM.getCost());

    }
}

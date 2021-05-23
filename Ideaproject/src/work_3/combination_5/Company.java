package combination_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Company  extends Unit{
    private List<Unit> unit = new ArrayList<Unit>();
    private String name;
    public void add(Unit element){
         unit.add(element);
    }

    @Override
    public void handleNotification() {
        System.out.println("-"+getName());
        for(Object obj:unit){
            ((Unit)obj).handleNotification();
        }
    }

    public Company(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
}

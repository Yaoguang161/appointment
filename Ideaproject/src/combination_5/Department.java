package combination_5;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */

public  class Department extends Unit{
    String name;
    public void add(Unit element){
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleNotification() {
        System.out.println(getName());
    }


    public Department(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

package priv.text.book3.lesson;

/**
 * Created by Enzo Cotter on 2020/12/27.
 */
public class SIMOfChinaUnicom  extends SIM{
    String number;
    public void setNumber(String n){
        number=n;
    }
    public String giveNumber(){
        return number;
    }
    public String giveCorpName(){
        return "中国联通";
    }

}

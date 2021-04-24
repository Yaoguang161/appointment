package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/28.
 */
// class first {
//    int channel;//电视频道
//    void setChannel(int m) {
//        if (m>=1) {
//            channel=m;
//        }
//    }
//    int getChannel() {
//        return channel;
//    }
//    void showProgram() {
//        switch (channel) {
//            case 1:System.out.println("综合频道");
//                break;
//            case 2:System.out.println ("经济频道");
//                break;
//            case 3:System.out.println("文艺频道");
//                break;
//            case 4:System.out.println ("国际频道");
//                break;
//            case 5:System.out.println("体育频道");
//                break;
//            default:System.out.println ("不能收看"+channel+"频道");
//        }
//    }
//}
//
// class second {
//    first homefirst;
//    void buyfirst(TV tv) {
//        homefirst=tv;
//    }
//    void remoteControl(int m) {
//        homefirst.setChannel(m);
//    }
//    void seefirst() {
//        homefirst.showProgram();
//    }
//}
//
//public class third {
//    public static void main(String args[]) {
//        first haierfirst=new first();
//        haierfirst.setChannel(5);
//        second zhangSanFamily=new second();
//        zhangSanFamily.buyfirst(haierfirst);
//        System.out.println("zhangSanFamily开始看电视节目");
//        zhangSanFamily.seefirst();
//        int m=2;
//        System.out.println("zhangSanFamily将电视更换到"+m+"频道");
//        zhangSanFamily.remoteControl(m);
//        System.out.println("haierfirst的频道是"+haierfirst.getChannel());
//        System.out.println("zhangSanFamily再看电视节目");
//        zhangSanFamily.seefirst();
//        second lisisecond = new second();
//        lisisecond.buyfirst(haierfirst);
//        lisisecond.seefirst();
//    }
//}

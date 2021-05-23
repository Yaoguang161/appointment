package bridge_3;

public class RMVB implements Player{
    @Override
    public void parsePlayer(String osType) {
        System.out.println("格式为RMVB的图像"+"在"+osType+"平台中解析显示。");
    }
}

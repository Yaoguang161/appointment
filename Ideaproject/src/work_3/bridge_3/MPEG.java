package bridge_3;

public class MPEG implements Player{
    @Override
    public void parsePlayer(String osType) {
        System.out.println("格式为MPEG的图像"+"在"+osType+"平台中解析显示。");
    }
}

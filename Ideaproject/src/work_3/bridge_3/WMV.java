package bridge_3;

public class WMV implements Player {
    @Override
    public void parsePlayer(String osType) {
        System.out.println("格式为WMV的图像"+"在"+osType+"平台中解析显示。");
    }
}

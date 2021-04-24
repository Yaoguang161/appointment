package priv.text.book3.gaunggao;

import javax.sound.midi.Soundbank;

/**
 * Created by Enzo Cotter on 2020/12/30.
 */
public class AdvertisementBoard {
    public void show(Advertisement adver) {
        System.out.printf(adver.getCorp() + "的广告词");
        adver.showAdvertisement();
    }
}
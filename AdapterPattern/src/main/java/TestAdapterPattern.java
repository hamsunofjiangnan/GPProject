/**
 * @Author: hamsun
 * @Description:
 * @Date: 2019/3/24 23:28
 */
public class TestAdapterPattern {
    public static void main(String[] args) {
        new AudioPlayer().play("mp3","gp.mp3");
        new AudioPlayer().play("mp4","gp.mp4");
        new AudioPlayer().play("vlc","gp.vlc");
        new AudioPlayer().play("gpv","gp.gpv");
    }

}

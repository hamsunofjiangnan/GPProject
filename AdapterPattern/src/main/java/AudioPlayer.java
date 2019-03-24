/**
 * @Author: hamsun
 * @Description:本来只支持mp3.通过mediaAdapter兼容其他接口，支持其他格式
 * @Date: 2019/3/24 23:25
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}

package com.github.sky;


/**
 * 描述：多媒体播放实现类
 *
 * @author sukai
 * @date 2021/10/8
 */
public class MediaPlayerImpl implements MediaPlayer {

    private AudioPlayerAdapter audioPlayerAdapter;

    @Override
    public void play(AudioType audioType, String filePath) {
        if (audioType == AudioType.AVI) {
            System.out.println("播放AVI格式的文件：" + filePath);
        } else if (audioType == AudioType.MP4) {
            System.out.println("播放MP4格式的文件：" + filePath);
        } else if (audioType == AudioType.WMA || audioType == AudioType.MP3) {
            audioPlayerAdapter = new AudioPlayerAdapter(audioType);
            audioPlayerAdapter.play(audioType, filePath);
        } else {
            throw new RuntimeException("不支持的音视频格式");
        }
    }
}

package com.github.sky;

/**
 * 描述：音频适配器
 * <p>
 * 基于音频的接口及实现，进行适配，转换功能
 *
 * @author sukai
 * @date 2021/10/8
 */
public class AudioPlayerAdapter implements MediaPlayer {

    private AudioPlayer audioPlayer;

    public AudioPlayerAdapter(AudioType audioType) {
        if (audioType == AudioType.WMA) {
            audioPlayer = new WmaPlayer();
        } else if (audioType == AudioType.MP3) {
            audioPlayer = new Mp3Player();
        }
    }

    @Override
    public void play(AudioType audioType, String filePath) {
        if (audioType == AudioType.WMA) {
            audioPlayer.playWma(filePath);
        } else if (audioType == AudioType.MP3) {
            audioPlayer.playMp3(filePath);
        } else {
            throw new RuntimeException("不支持的音频格式");
        }
    }
}

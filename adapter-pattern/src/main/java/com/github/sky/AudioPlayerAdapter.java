package com.github.sky;

/**
 * 描述：音频适配器
 *
 * @author sukai
 * @date 2021/10/8
 */
public class AudioPlayerAdapter implements AudioPlayer {

    private AudioPlayer audioPlayer;

    public AudioPlayerAdapter(AudioType audioType) {
        if (AudioType.MP3 == audioType) {
            audioPlayer = new Mp3Player();
        } else if (AudioType.WMA == audioType) {
            audioPlayer = new WmaPlayer();
        }
    }

    @Override
    public void playMp3(String filePath) {
        audioPlayer.playMp3(filePath);
    }

    @Override
    public void playWma(String filePath) {
        audioPlayer.playWma(filePath);
    }
}

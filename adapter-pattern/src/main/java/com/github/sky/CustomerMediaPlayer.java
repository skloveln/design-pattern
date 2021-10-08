package com.github.sky;


/**
 * 描述：多媒体播放
 *
 * 已有音频的接口及实现，直接在此基础上进行适配
 *
 * @author sukai
 * @date 2021/10/8
 */
public class CustomerMediaPlayer implements MediaPlayer {

    private AudioPlayerAdapter audioPlayerAdapter;

    @Override
    public void play(AudioType audioType, String filePath) {
        if (audioType == AudioType.AVI) {
            System.out.println("播放AVI格式的文件：" + filePath);
        } else if (audioType == AudioType.MP4) {
            System.out.println("播放MP4格式的文件：" + filePath);
        } else if (audioType == AudioType.WMA) {
            audioPlayerAdapter = new AudioPlayerAdapter(audioType);
            audioPlayerAdapter.playWma(filePath);
        } else if (audioType == AudioType.MP3) {
            audioPlayerAdapter = new AudioPlayerAdapter(audioType);
            audioPlayerAdapter.playMp3(filePath);
        } else {
            throw new RuntimeException("不支持的音视频格式");
        }
    }
}

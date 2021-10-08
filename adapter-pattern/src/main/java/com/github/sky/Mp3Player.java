package com.github.sky;

/**
 * 描述：MP3格式文件播放
 *
 * @author sukai
 * @date 2021/10/8
 */
public class Mp3Player implements AudioPlayer {

    @Override
    public void playMp3(String filePath) {
        System.out.println("播放MP3格式的文件：" + filePath);
    }

    @Override
    public void playWma(String filePath) {
        throw new RuntimeException("不支持的文件格式");
    }

}

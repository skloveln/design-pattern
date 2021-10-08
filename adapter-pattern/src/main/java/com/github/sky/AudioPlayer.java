package com.github.sky;

/**
 * 描述：音频播放
 * 已知的接口
 *
 * @author sukai
 * @date 2021/10/8
 */
public interface AudioPlayer {

    /**
     * 播放MP3格式文件
     *
     * @param filePath
     */
    public void playMp3(String filePath);

    /**
     * 播放WMA格式文件
     *
     * @param filePath
     */
    public void playWma(String filePath);
}

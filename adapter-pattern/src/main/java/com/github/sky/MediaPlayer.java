package com.github.sky;

/**
 * 描述：多媒体文件播放
 *
 * 扩展音频播放实现，加入视频的播放实现
 *
 * @author sukai
 * @date 2021/10/8
 */
public interface MediaPlayer {

    /**
     * 播放指定文件格式的音视频文件
     *
     * @param audioType
     * @param filePath
     */
    public void play(AudioType audioType, String filePath);

}

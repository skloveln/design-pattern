package com.github.sky;

/**
 * 描述：WMA格式文件播放
 *
 * @author sukai
 * @date 2021/10/8
 */
public class WmaPlayer implements AudioPlayer{

    @Override
    public void playMp3(String filePath) {
        throw new RuntimeException("不支持的文件格式");
    }

    @Override
    public void playWma(String filePath) {
        System.out.println("播放WMA格式的文件：" + filePath);
    }

}

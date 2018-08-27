package com.github.sky;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 需要创建的单例类
 */
public class Resource {

    public Resource(){
        System.out.println("创建时间：" +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}

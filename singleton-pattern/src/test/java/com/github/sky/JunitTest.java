package com.github.sky;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void testSingleton1(){
        Resource instance1 = Singleton1.getInstance();
        Resource instance2 = Singleton1.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testSingleton2(){
        Resource instance1 = Singleton2.getInstance();
        Resource instance2 = Singleton2.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testSingleton3(){
        Resource instance1 = Singleton3.getInstance();
        Resource instance2 = Singleton3.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testSingleton4(){
        Resource instance1 = Singleton4.getInstance();
        Resource instance2 = Singleton4.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }

    @Test
    public void testSingleton5(){
        Resource instance1 = Singleton5.INSTANCE.getInstance();
        Resource instance2 = Singleton5.INSTANCE.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }
}

package com.github.sky.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述：动态代理
 *
 * @author sukai
 * @date 2021/10/11
 */
public class DynamicProxy {

    /**
     * 创建代理类
     *
     * 注意 被代理的对象一定要有接口以实现
     *
     * @param proxiedObject 被代理对象
     * @return
     */
    public Object createProxy(Object proxiedObject) {
        // 目标接口
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        // 目标的处理类
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        // 创建代理类
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 代理前处理...
            Object result = method.invoke(proxiedObject, args);
            // 代理后处理...
            return result;
        }
    }
}

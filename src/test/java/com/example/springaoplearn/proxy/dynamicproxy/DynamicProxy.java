package com.example.springaoplearn.proxy.dynamicproxy;

import com.example.springaoplearn.proxy.staticproxy.Sell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by louxiu
 */

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before");
        Object result = method.invoke(object, args);
        System.out.println("after");
        return result;

    }

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new Vender());

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, (InvocationHandler) proxy));

        sell.sell();
        System.out.println(sell.getClass());
    }
}

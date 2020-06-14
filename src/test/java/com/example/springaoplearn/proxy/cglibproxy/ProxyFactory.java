package com.example.springaoplearn.proxy.cglibproxy;

import com.example.springaoplearn.proxy.dynamicproxy.Vender;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by louxiu
 */

public class ProxyFactory implements MethodInterceptor {

    private final Object obj;

    ProxyFactory(Object object) {
        this.obj = object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务.....");

        // 执行目标对象的方法
        Object returnValue = method.invoke(obj, objects);

        System.out.println("提交事务.....");
        return returnValue;
    }

    // 给目标对象创建代理对象
    public Object getProxyInstance() {
        //1. 工具类
        Enhancer en = new Enhancer();
        //2. 设置父类
        en.setSuperclass(obj.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类(代理对象)
        return en.create();
    }

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Vender());
        Vender proxyInstance = (Vender) proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.getClass());
    }
}

package com.example.springaoplearn.proxy.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by sws
 */

public interface InvokeHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;
}

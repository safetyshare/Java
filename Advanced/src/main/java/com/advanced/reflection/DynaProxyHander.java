package com.advanced.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynaProxyHander implements InvocationHandler{
    private Object target;
    public Object newProxyInstance(Object target){
        this.target=target;
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        try {
            result=method.invoke(target, args);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
        return result;
    }
}

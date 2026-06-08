package com.advanced.reflection;

public class ProxyCompany implements ClothingFactory{
    private ClothingFactory cf;
    public ProxyCompany(ClothingFactory cf){
        this.cf=cf;

    }
    public void produceChothing(){
        System.out.println("代理公司收取10000元中介费");
        cf.produceChothing();
    }
}

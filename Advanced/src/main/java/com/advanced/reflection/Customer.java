package com.advanced.reflection;

public class Customer {
    public static void main(String[] args) {
        ClothingFactory cf =new ProxyCompany(new LiNingCompany());
        cf.produceChothing();
        DynaProxyHander handler = new DynaProxyHander();
        ClothingFactory proxy=(ClothingFactory)handler.newProxyInstance(new LiNingCompany());
        proxy.produceChothing();
    }
}

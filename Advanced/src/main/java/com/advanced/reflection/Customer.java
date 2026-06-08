package com.advanced.reflection;

public class Customer {
    public static void main(String[] args) {
        ClothingFactory cf =new ProxyCompany(new LiNingCompany());
        cf.produceChothing();
    }
}

package com.grs.singletonDesignPattern.singleton;

//Java code for Bill Pugh Singleton Implementation
public class BillPugh
{

private BillPugh()
{
 // private constructor
}

// Inner class to provide instance of class
private static class BillPughSingleton
{
 private static final BillPugh INSTANCE = new BillPugh();
}

public static BillPugh getInstance()
{
 return BillPughSingleton.INSTANCE;
}
}

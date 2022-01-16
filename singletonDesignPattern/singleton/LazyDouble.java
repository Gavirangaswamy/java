package com.grs.singletonDesignPattern.singleton;


//Java code to explain double check locking
public class LazyDouble
{

private static LazyDouble instance;

private LazyDouble()
{
 // private constructor
}

public static LazyDouble getInstance()
{
 if (instance == null)
 {
   
   synchronized (LazyDouble.class)
   {
     if(instance==null)
     {
       // if instance is null, initialize
       instance = new LazyDouble();
     }
    
   }
 }
 return instance;
}
}
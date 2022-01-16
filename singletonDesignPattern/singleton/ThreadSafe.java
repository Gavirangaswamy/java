package com.grs.singletonDesignPattern.singleton;


//Singleton class
public class ThreadSafe
{

private static ThreadSafe instance;

private ThreadSafe()
{
 // private constructor
}

//synchronized method to control simultaneous access
synchronized public static ThreadSafe getInstance()
{
 if (instance == null)
 {
   // if instance is null, initialize
   instance = new ThreadSafe();
 }
 return instance;
}
}

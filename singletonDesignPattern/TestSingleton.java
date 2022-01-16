package com.grs.singletonDesignPattern;

import com.grs.singletonDesignPattern.singleton.BillPugh;
import com.grs.singletonDesignPattern.singleton.Eager;
import com.grs.singletonDesignPattern.singleton.Lazy;
import com.grs.singletonDesignPattern.singleton.LazyDouble;
import com.grs.singletonDesignPattern.singleton.SingletonEnum;
import com.grs.singletonDesignPattern.singleton.Static;
import com.grs.singletonDesignPattern.singleton.ThreadSafe;

public class TestSingleton {

	public static void main(String[] args) {

		Eager tempSingleton = Eager.getInstance();

		Static instance = Static.instance;

		ThreadSafe instance2 = ThreadSafe.getInstance();

		LazyDouble instance3 = LazyDouble.getInstance();

		BillPugh instance4 = BillPugh.getInstance();

		SingletonEnum singleton = SingletonEnum.INSTANCE;

		System.out.println(singleton.getValue());

		singleton.setValue(2);

		System.out.println(singleton.getValue());

	}

}

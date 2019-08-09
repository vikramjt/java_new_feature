package com.vikram.thread.staticmethod.sync;

public class Main {

	public static void main(String[] args) {
		TestSynchronizationStatic testObj = new TestSynchronizationStatic();
		TestThreadA threadA = new TestThreadA(testObj);
		threadA.setName("ThreadA");
		
		TestThreadB threadB = new TestThreadB(testObj);
		threadB.setName("ThreadB");
		
		TestThreadC threadC = new TestThreadC(testObj);
		threadC.setName("ThreadC");
		
		TestThreadD threadD = new TestThreadD(testObj);
		threadD.setName("ThreadD");
		
		TestThreadE threadE = new TestThreadE(testObj);
		threadE.setName("ThreadE");
		
		threadA.start();
		
		//Thread B will wait on methodB as lock is taken by threadA on same object in different method
		threadB.start();
		
		//This thread will call the static method which is not synchronize
		threadC.start();
		
		//synchronize static method 1st will collide for lock with E method.
		// as the lock will be on the class not on object.
		threadD.start();
		
		//synchronize static method 2nd will collide for lock with D method.
		// as the lock will be on the class not on object.
		threadE.start();
	}
	


}

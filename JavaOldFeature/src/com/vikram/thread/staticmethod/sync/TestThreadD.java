package com.vikram.thread.staticmethod.sync;

class TestThreadD extends Thread{
	
	TestSynchronizationStatic test;
	public TestThreadD(TestSynchronizationStatic a) {
		test = a;
	}
	@Override
	public void run() {
		
		TestSynchronizationStatic.methodD();
		
	}
}

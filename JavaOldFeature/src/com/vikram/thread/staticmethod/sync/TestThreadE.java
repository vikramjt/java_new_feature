package com.vikram.thread.staticmethod.sync;

class TestThreadE extends Thread{
	
	TestSynchronizationStatic test;
	public TestThreadE(TestSynchronizationStatic a) {
		test = a;
	}
	@Override
	public void run() {
		
		TestSynchronizationStatic.methodE();
		
	}
}

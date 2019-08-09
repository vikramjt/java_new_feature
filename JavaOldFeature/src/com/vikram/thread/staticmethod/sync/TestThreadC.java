package com.vikram.thread.staticmethod.sync;

class TestThreadC extends Thread{
	
	TestSynchronizationStatic test;
	public TestThreadC(TestSynchronizationStatic a) {
		test = a;
	}
	@Override
	public void run() {
		
		TestSynchronizationStatic.methodC();
		
	}
}

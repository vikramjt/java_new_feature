package com.vikram.thread.staticmethod.sync;

class TestThreadB extends Thread{
	
	TestSynchronizationStatic test;
	public TestThreadB(TestSynchronizationStatic a) {
		test = a;
	}
	@Override
	public void run() {
		
		test.methodB();
		
	}
}
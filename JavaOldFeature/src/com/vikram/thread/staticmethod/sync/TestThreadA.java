package com.vikram.thread.staticmethod.sync;
class TestThreadA extends Thread{
	
		TestSynchronizationStatic test;
		public TestThreadA(TestSynchronizationStatic a) {
			test = a;
		}
		@Override
		public void run() {
			
			test.methodA();
			
		}
}
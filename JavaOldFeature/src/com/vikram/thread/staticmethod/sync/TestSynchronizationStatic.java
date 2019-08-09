package com.vikram.thread.staticmethod.sync;

public class TestSynchronizationStatic {

	public synchronized void methodA() {
		System.out.println(Thread.currentThread().getName() + " Thread: Method A Wait...");
		for(int i=0; i < 5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("A.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread in Method A complete");
	}
	
	public synchronized void methodB() {
		System.out.println(Thread.currentThread().getName() + " Thread: Method B Wait...");
		for(int i=0; i < 5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("B.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread in Method B complete");
	}
	
	public static void methodC() {

		System.out.println(Thread.currentThread().getName() + " Thread: Method C Wait...");
		for(int i=0; i < 5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("C.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread in Method C complete");
	
	}
	
	public synchronized static void methodD() {

		System.out.println(Thread.currentThread().getName() + " Thread: Method D Wait...");
		for(int i=0; i < 5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("D.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread in Method D complete");
	
	}
	
	public synchronized static void methodE() {

		System.out.println(Thread.currentThread().getName() + " Thread: Method E Wait...");
		for(int i=0; i < 5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("E.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread in Method E complete");
	
	}
}

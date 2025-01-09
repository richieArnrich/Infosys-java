package MultiThreading;

public class ThreadDemo1 extends Thread{
//	to see my thread running override run()
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("current thread" + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
//		start the thread
		t1.start();
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.start();
		for(int i = 1; i<=10; i++) {
			System.out.println("Main thread");
		}
	}
}

package study;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_1 t1 = new Thread_1();
		t1.start();
		
		Runnable r = new Thread_2();
		Thread t2 = new Thread(r); 
		
		t2.start();
	}
 
}
class Thread_1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			//조상인 Thread의 getName() 호출
			System.out.println(getName());
		}
	}
}

//Runnable 인터페이스 구현 
class Thread_2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			//Thread.currentThread() 현재 실행중인 Thread 반환 
			System.out.println(Thread.currentThread().getName());
		}
	}
}
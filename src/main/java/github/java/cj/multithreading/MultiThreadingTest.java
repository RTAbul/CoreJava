package github.java.cj.multithreading;

public class MultiThreadingTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello world");
		
		//System.out.println("Name :----->" + Thread.currentThread().getName());
		System.out.println("state: ---> " + Thread.currentThread().getState());
		
		PrintTable pt = new PrintTable();
		System.out.println("state: ---> " + pt.getState());
		pt.start();
		System.out.println("state: ---> " + pt.getState());
		try {
			pt.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("state: ---> " + pt.getState());
		
		PrintTableThree ptt = new PrintTableThree();
		ptt.start();
		pt.join();

		System.out.println("state: ---> " + pt.getState());
	}

}

package github.java.cj.multithreading;

public class PrintTable extends Thread{

	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(2*i);

		}
		System.out.println("test");	
	}
	
}

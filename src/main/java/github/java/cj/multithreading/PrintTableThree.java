package github.java.cj.multithreading;

public class PrintTableThree  extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(3*i);
		}	
	}

}

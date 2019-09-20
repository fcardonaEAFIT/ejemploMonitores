public class CreateThread2 extends Thread  {

    public void run() {
	System.out.println("Hello word from CreateThread 2");
    }

    public static void main(String[] args) {

	Thread t = new CreateThread2();
	t.start();
	System.out.println("Hilo: " + t + " estas vivo: " + t.isAlive());
	try {
	    t.join();
	}
	catch (InterruptedException ie) { }
    }

}

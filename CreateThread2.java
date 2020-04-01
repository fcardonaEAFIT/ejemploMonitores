public class CreateThread2
      extends Thread  {

    public CreateThread2() {
	super();
    }
    
    // public CreateThread2(String name) {
    // 	super(name);
    // }
    
    public void run() {
	while (true) {
	    System.out.println("Hello word from CreateThread 2");
	    if (Thread.currentThread().isInterrupted())
		break;
	}
    }

    public static void main(String[] args) {

	Thread t = new CreateThread2();
	t.setName("Mi hilo");
	t.setPriority(10);
	t.start();
	System.out.println("Hilo: " + t + " estas vivo: " + t.isAlive());
	try {
	    Thread
		.currentThread()
		.sleep(2000);
	    t.interrupt();
	    t.join();
	}
	catch (InterruptedException ie) { }
	System.out.println(t.isAlive());
    }

}

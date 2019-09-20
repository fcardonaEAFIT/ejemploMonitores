import java.util.Random;

public class CreateThread3 {

    public static void main(String[] args) {

	Runnable hilo = new Runnable() {
		public void run() {
		    int n = 0;
		    int retry = 0;
		    while (true) {
			n++;
			if ((n % 10000) == 0) {
			    if (Thread.interrupted()) {
				retry++;
				if ((retry % 3) == 0) {
				    System.out.println("I'm going to die");
				    break;
				}
			    }
			}
		    }
		}
	    };

	Random r = new Random();

	Thread t = new Thread(hilo, "Mi hilo");
	t.start();
	System.out.println("Hilo: " + t + " estas vivo: " + t.isAlive());
	while (t.isAlive()) {
	    t.interrupt();
	    try {
		Thread.sleep(r.nextInt() % 2000);
	    }
	    catch(InterruptedException ie) { }
	}
    }

}

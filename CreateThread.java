public class CreateThread {

    public static void main(String[] args) {

	Runnable hilo = new Runnable() {
		public void run() {
		    System.out.println("Hola mundo hilo");
		}
	    };

	Thread t = new Thread(hilo, "Mi hilo");
	t.start();
	System.out.println("Hilo: " + t + " estas vivo: " + t.isAlive());
	try {
	    t.join();
	}
	catch (InterruptedException ie) { }
    }

}

public class CreateThread {

    public static void main(String[] args) {

	Runnable hilo = new Runnable() {
		public void run() {
		    for (int i = 0; i < 10; i++)
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

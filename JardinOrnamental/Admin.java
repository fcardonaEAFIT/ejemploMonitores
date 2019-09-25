public class Admin implements Runnable {

    private JardinOrnamental jardin;

    public Admin(JardinOrnamental jardin) {
	this.jardin = jardin;
    }

    public void run() {
	while (true) {
	    System.out.println("Nro: visitantes: " + jardin.obtNPersonas());
	    try {
		Thread.sleep(5);
	    }
	    catch (InterruptedException ie) { }
	}
    }
}

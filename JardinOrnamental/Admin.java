public class Admin implements Runnable {

    private Acceso jardin;

    public Admin(Acceso jardin) {
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

public class Admin implements Runnable {

    private Acceso jardin;

    public Admin(Acceso jardin) {
	this.jardin = jardin;
    }

    public void run() {
	while (true) {
	    System.out.println("Nro: visitantes: " + jardin.obtNPersonas());
	    try {
		Thread.sleep(1000);
	    }
	    catch (InterruptedException ie) { }
	}
    }
}

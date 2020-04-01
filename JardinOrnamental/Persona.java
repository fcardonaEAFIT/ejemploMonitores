public class Persona implements Runnable {
    private Acceso jardin;

    public Persona(Acceso jardin) {
	this.jardin = jardin;
    }

    public void run() {
	while (true) {
	    jardin.entrar();
	    try {
		Thread.sleep(2000);
	    }
	    catch (InterruptedException ie) { }
	    jardin.salir();
	}
    }
}

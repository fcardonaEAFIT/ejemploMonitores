public class Persona implements Runnable {
    private Acceso jardin;

    public Persona(Acceso jardin) {
	this.jardin = jardin;
    }

    public void run() {
	jardin.entrar();
	try {
	    Thread.sleep(3);
	}
	catch (InterruptedException ie) { }
	jardin.salir();
    }
}

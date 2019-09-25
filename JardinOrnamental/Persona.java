public class Persona implements Runnable {
    private JardinOrnamental jardin;

    public Persona(JardinOrnamental jardin) {
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

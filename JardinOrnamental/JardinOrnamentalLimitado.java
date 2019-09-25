public class JardinOrnamentalLimitado implements Acceso {

    private int nMaxPersonas;
    private int nPersonas;

    public JardinOrnamentalLimitado(int nMaxPersonas) {
	nPersonas = 0;
	this.nMaxPersonas = nMaxPersonas;
    }

    public synchronized void entrar() {
	while (nPersonas == nMaxPersonas) {
	    try {
		wait();
	    } catch (InterruptedException ie) { }
	}
	nPersonas++;
    }

    public synchronized void salir() {
	if (nPersonas == nMaxPersonas) {
	    notify();
	}
	nPersonas--;
    }

    public synchronized int obtNPersonas() {
	return nPersonas;
    }

}

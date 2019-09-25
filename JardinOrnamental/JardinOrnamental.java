public class JardinOrnamental {

    private int nPersonas;

    public JardinOrnamental() {
	nPersonas = 0;
    }

    public synchronized void entrar() {
	nPersonas++;
    }

    public synchronized void salir() {
	nPersonas--;
    }

    public synchronized int obtNPersonas() {
	return nPersonas;
    }

}

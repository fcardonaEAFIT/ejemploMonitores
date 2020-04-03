public class Filosofo implements Runnable {

    private Tenedor izq;
    private Tenedor der;
    private int nFilosofo;
    private int vezComiendo;
    
    public Filosofo(Tenedor izq, Tenedor der, int nFilosofo) {
	this.izq = izq;
	this.der = der;
	this.nFilosofo = nFilosofo;
	this.vezComiendo = 0;
    }

    public void run() {
	while(true) {
	    System.out.println("Pensando");
	    synchronized(izq) {
		synchronized(der) {
		    vezComiendo++;
		    System.out.println("Filosofo: " + nFilosofo +
				       " comiendo por " +
				       vezComiendo);
		}
	    }
	}
    }
}

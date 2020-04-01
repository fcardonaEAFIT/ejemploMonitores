public class Filosofo implements Runnable {

    private Tenedor izq;
    private Tenedor der;
    public Filosofo(Tenedor izq, Tenedor der) {
	if (izq.getNivel() < der.getNivel()) {
	    this.izq = izq;
	    this.der = der;
	}
	else {
	    this.izq = der;
	    this.der = izq;
	}
    }

    public void run() {
	while(true) {
	    System.out.println("Pensando");
	    synchronized(izq) {
		synchronized(der) {
		    System.out.println("Comiendo");
		}
	    }
	}
    }
}

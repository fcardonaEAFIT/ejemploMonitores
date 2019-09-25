public class Filosofo implements Runnable {

    private Tenedor izq;
    private Tenedor der;
    public Filosofo(Tenedor izq, Tenedor der) {
	this.izq = izq;
	this.der = der;
    }

    public void run() {
	while(true) {
	    System.out.println("Pensando");
	    izq.tomar();
	    der.tomar();
	    System.out.println("Comiendo");
	    der.dejar();
	    izq.dejar();
	}
    }
}

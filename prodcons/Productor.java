public class Productor implements Runnable {

    private Buffer buffer;
    private int contador;

    public Productor(Buffer buffer, int contador) {
	this.buffer = buffer;
	this.contador = contador;
    }

    public void run() {

	while(true) {
	    buffer.producir(contador++);
	    try {
		Thread.sleep(2);
	    }
	    catch (InterruptedException ie) { }
	}
    }

}

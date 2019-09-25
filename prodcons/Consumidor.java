public class Consumidor implements Runnable {

    private Buffer buffer;

    public Consumidor(Buffer buffer) {
	this.buffer = buffer;
    }

    public void run() {

	while(true) {
	    int ret = buffer.consumir();
	    System.out.println("Valor: " + ret);
	    try {
		Thread.sleep(2);
	    }
	    catch (InterruptedException ie) { }
	}
    }

}

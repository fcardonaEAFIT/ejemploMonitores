public class Main {

    public static void main(String []args) {
	Buffer buffer = new Buffer(10);
	Thread tp = new Thread(new Productor(buffer, 0));
	Thread tp2 = new Thread(new Productor(buffer, 10000));
	Thread tc = new Thread(new Consumidor(buffer));

	tp.start();
	tp2.start();
	tc.start();
	try {
	    tp.join();
	} catch (InterruptedException ie) { }
    }
}

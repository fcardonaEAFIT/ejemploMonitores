public class Buffer {

    private int[] buffer;
    private int tamaño;
    private int entra;
    private int sale;
    private int cantidad;

    public Buffer(int tamaño) {
	buffer = new int[tamaño];
	this.tamaño = tamaño;
	cantidad = entra = sale = 0;
    }

    public synchronized void producir(int item) {
	while (cantidad == tamaño)
	    try {
		wait();
	    } catch (InterruptedException ie) { }

	buffer[entra] = item;
	entra = (entra + 1) % tamaño;
	cantidad++;
	notifyAll();
    }

    public synchronized int consumir() {
	while (cantidad == 0)
	    try {
		wait();
	    } catch (InterruptedException ie) { }

	int ret = buffer[sale];
	sale = (sale + 1) % tamaño;
	cantidad--;

	notifyAll();
	return ret;
    }

}

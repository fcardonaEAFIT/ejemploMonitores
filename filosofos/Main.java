public class Main {

    public static void main(String[] args) {
	Tenedor []tenedores = new Tenedor[5];
	Filosofo []filosofos = new Filosofo[5];
	Thread []hFilosofos = new Thread[5];

	for (int i = 0; i < 5; i++) {
	    tenedores[i] = new Tenedor();
	}

	for (int i = 0; i < 5; i++) {
	    filosofos[i] = new Filosofo(tenedores[i], tenedores[(i+1) % 5]);
	    hFilosofos[i] = new Thread(filosofos[i]);
	    hFilosofos[i].start();
	}

	try {
	    hFilosofos[0].join();
	} catch(InterruptedException ie) { }
    }
}

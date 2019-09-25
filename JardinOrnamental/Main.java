public class Main {

    public static void main(String []args) {
	JardinOrnamental jardin = new JardinOrnamental();
	Admin admin = new Admin(jardin);
	Thread tAdmin = new Thread(admin);
	tAdmin.start();
	for (int i = 0; i < 100000; i++) {
	    Persona p = new Persona(jardin);
	    Thread t = new Thread(p);
	    t.start();
	}

	try {
	    tAdmin.join();
	}
	catch (InterruptedException ie) { }
    }
}

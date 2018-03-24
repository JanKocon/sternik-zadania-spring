package pl.sternik.kk.zadania.spring.zad11;

public class Connection {

	String connectionString;

	public Connection(String connectionString) {
		super();
		this.connectionString = connectionString;
	}

	@Override
	public String toString() {
		return "Connection [connectionString=" + connectionString + "]";
	}
	

}

package db;

public class DbIntregrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public DbIntregrityException(String msg) {
		super(msg);
	}
}

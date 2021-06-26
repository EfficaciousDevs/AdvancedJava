package JdbcConcepts;
//make the required changes to this class so that InvalidConsumerNumberException is of type exception. 

public class InvalidConsumerNumberException extends Exception {
	public InvalidConsumerNumberException(String message) {
		super(message);
	}
}
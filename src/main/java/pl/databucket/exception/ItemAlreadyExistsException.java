package pl.databucket.exception;

@SuppressWarnings("serial")
public class ItemAlreadyExistsException extends Exception {

	public ItemAlreadyExistsException(String itemType, String itemName) {
        super(itemType + " '" + itemName + "' already exists!");
    }
	
	public ItemAlreadyExistsException(String message) {
        super(message);
    }

}
